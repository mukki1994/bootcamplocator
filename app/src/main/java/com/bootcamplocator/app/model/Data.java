package com.bootcamplocator.app.model;

public class Data {
    private float latitude;
    private float longitude;
    private String locationTitle;
    private String locationAddress;
    private String locationImgUrl;

    public Data(float latitude, float longitude, String locationTitle, String locationAddress, String locationImgUrl) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.locationTitle = locationTitle;
        this.locationAddress = locationAddress;
        this.locationImgUrl = locationImgUrl;
    }
}
