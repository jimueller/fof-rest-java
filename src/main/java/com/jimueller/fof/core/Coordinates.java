package com.jimueller.fof.core;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.math3.util.Precision;

import java.math.BigDecimal;

public class Coordinates {
    double latitude;
    double longitude;
    String latDMS;
    String longDMS;

    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Coordinates(double latitude, double longitude, String latDMS, String longDMS) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.latDMS = latDMS;
        this.longDMS = longDMS;
    }

    public Coordinates(String latitude, String longitude, String latDMS, String longDMS) {
        setLatitude(latitude);
        setLongitude(longitude);
        this.latDMS = latDMS;
        this.longDMS = longDMS;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = Precision.round(latitude, 6, BigDecimal.ROUND_HALF_UP);
    }

    public void setLatitude(String latitude){
        double lat = Double.parseDouble(latitude);
        setLatitude(lat);
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = Precision.round(longitude, 6, BigDecimal.ROUND_HALF_UP);
    }

    public void setLongitude(String longitude) {
        double lon = Double.parseDouble(longitude);
        setLongitude(lon);
    }

    public String getLatDMS() {
        return latDMS;
    }

    public void setLatDMS(String latDMS) {
        this.latDMS = latDMS;
    }

    public String getLongDMS() {
        return longDMS;
    }

    public void setLongDMS(String longDMS) {
        this.longDMS = longDMS;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("latitude", latitude)
                .append("longitude", longitude)
                .append("latDMS", latDMS)
                .append("longDMS", longDMS)
                .toString();
    }
}
