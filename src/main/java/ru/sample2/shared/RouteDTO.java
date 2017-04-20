package ru.sample2.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna on 19.04.2017.
 */
public class RouteDTO {
    private List<RoutesEntity> routes =  new ArrayList<>();

    public RouteDTO() {
    }
    @JsonCreator
    public RouteDTO(@JsonProperty("routes")List<RoutesEntity> routes) {
        this.routes = routes;
    }

    public List<RoutesEntity> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesEntity> routes) {
        this.routes = routes;
    }




}
