package com.example.nishant.bootcamplocator.model;

/**
 * Created by nishant on 5/22/17.
 */

public class Devslopes {

    final String DRAWABLE  = "drawable/";



    private float longitude;
    private float latitude;
    private  String locationAddress;
    private  String locationTitle;
    private String locationImrUrl;


    public Devslopes(float longitude, float latitude, String locationAddress, String locationTitle, String locationImrUrl) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.locationAddress = locationAddress;
        this.locationTitle = locationTitle;
        this.locationImrUrl = locationImrUrl;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public String getLocationTitle() {
        return locationTitle;
    }

    public String getLocationImrUrl() {
        return locationImrUrl;
    }

    public String getImageUrl(){
       return DRAWABLE + locationImrUrl;
    }
}
