package ru.sample2.server;

import ru.sample2.shared.RouteDTO;
import ru.sample2.shared.RoutesEntity;

/**
 * Created by Anna on 19.04.2017.
 */
public interface RouteRepository {
    RouteDTO sendRoute(RoutesEntity routesEntity);
}
