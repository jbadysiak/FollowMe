package com.jakubbadysiak.followme.Database;

import android.content.Context;

import java.util.List;

/**
 * Created by jakub.badysiak on 10.10.2017.
 */

public class DatabaseQuery{
    private List<LocationObject> allLocationObjects;

    public DatabaseQuery(Context context) {
    }

    public void addNewLocationObject(long l, double latitudeValue, double longitudeValue) {
        LocationObject locationObject = new LocationObject(l, latitudeValue, longitudeValue);
        for (long i = 0; i<allLocationObjects.size();i++){
            if (i == (allLocationObjects.size()-1)){
                allLocationObjects.add(locationObject);
            }
        }
    }

    public List<LocationObject> getAllLocationObjects() {
        return allLocationObjects;
    }
}
