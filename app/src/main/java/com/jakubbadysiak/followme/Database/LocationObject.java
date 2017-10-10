package com.jakubbadysiak.followme.Database;

/**
 * Created by jakub.badysiak on 10.10.2017.
 */

public class LocationObject {
    private long time;
    private double latitude;
    private double longitude;

    public LocationObject(long time, double latitude, double longitude) {
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getTime() {
        return time;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
