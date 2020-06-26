package com.bandtec.techconnective.model;

import java.util.Arrays;

public class Geolocalizacao {
    private Integer latitude;
    private Integer longitude;

    public Geolocalizacao(Integer latitude, Integer longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Geolocalizacao(){}

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }
}
