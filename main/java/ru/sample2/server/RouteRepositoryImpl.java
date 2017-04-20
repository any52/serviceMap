package ru.sample2.server;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import ru.sample2.shared.RouteDTO;
import ru.sample2.shared.RoutesEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna on 19.04.2017.
 */
public class RouteRepositoryImpl implements RouteRepository {
    private List<RoutesEntity> routes;
    private Session session;


    @Override
    public RouteDTO sendRoute(RoutesEntity route) {
        if (routes == null) {
            routes = new ArrayList<>();
        }
        SessionFactory sessions = new Configuration().configure().buildSessionFactory();
        session = sessions.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("FROM RoutesEntity ");
        routes = query.list();

        RoutesEntity newRoute = new RoutesEntity();
        newRoute.setId(routes.size()+1);
        newRoute.setStartpoint(route.getStartpoint());
        newRoute.setEndpoint(route.getEndpoint());


        routes.add(newRoute);
        session.save(newRoute);
        tx.commit();

        session.close();
        RouteDTO routeDTO = new RouteDTO(routes);
        return routeDTO;
    }
}
