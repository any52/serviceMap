package ru.sample2.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.maps.client.MapOptions;
import com.google.gwt.maps.client.MapTypeId;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.base.LatLng;
import com.google.gwt.maps.client.overlays.InfoWindow;
import com.google.gwt.maps.client.overlays.InfoWindowOptions;
import com.google.gwt.maps.client.overlays.Marker;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.user.client.ui.*;
import ru.sample2.client.model.TextModel;

import javax.inject.Inject;

/**
 * Created by Anna on 02.01.2017.
 */
public class View {
    private EventBus eventBus;
//    private  Presenter presenter;
    Presenter presenter = new Presenter(new TextModel(), eventBus, this);

    final SuggestBox suggestbox = new SuggestBox(new RemoteSuggestOracle(eventBus, (EndPoint) GWT.create(EndPoint.class)));
    final Label label = new Label("No selected!");
    MapWidget map;
    InfoWindow infoWin;
    Marker marker;

    @Inject
    View(EventBus eventbus) {
        this.eventBus = eventbus;
//        this.presenter = presenter;
    }

    public void createView() {

        suggestbox.setStyleName("gwt-SuggestBox");
        HorizontalPanel hp = new HorizontalPanel();
        VerticalPanel vp1 = new VerticalPanel();
        VerticalPanel vp2 = new VerticalPanel();

        LatLng center = LatLng.newInstance(55.45, 37.361);
        MapOptions opts = MapOptions.newInstance();
        opts.setZoom(8);
        opts.setCenter(center);
        opts.setMapTypeId(MapTypeId.ROADMAP);
        opts.setMapMaker(true);
        map = new MapWidget(opts);
        map.setSize("500px", "500px");

        MarkerOptions markerOptions = MarkerOptions.newInstance();
        markerOptions.setTitle("Street");
        InfoWindowOptions infoWindowOptions = InfoWindowOptions.newInstance();
        marker = Marker.newInstance(markerOptions);
        marker.setPosition(center);
        marker.setMap(map);
        infoWin = InfoWindow.newInstance(infoWindowOptions);
        infoWin.setPosition(center);
        infoWin.open(map);

        vp1.add(suggestbox);
        vp1.add(label);
        vp2.add(map);
        hp.add(vp1);
        hp.add(vp2);
        RootPanel.get("ListContainer").add(hp);


        suggestbox.addSelectionHandler(new SelectionHandler<SuggestOracle.Suggestion>() {
            @Override
            public void onSelection(SelectionEvent<SuggestOracle.Suggestion> event) {

                String selected = suggestbox.getValue();
//
                presenter.changeModel(selected);
                presenter.updateLabel();
                presenter.geolocation();
            }
        });


    }


}



