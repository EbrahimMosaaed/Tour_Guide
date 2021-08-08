package com.example.tourguide;

public class Item {

    private String mPlaceName;
    private String mPlacedetails;
    private int mPlaceImageId = DEFAULT_ID;
    private static final int DEFAULT_ID = -1;

    public Item(String placeName, String placeDetails, int placeImageId) {

        mPlaceName = placeName;
        mPlacedetails = placeDetails;
        mPlaceImageId = placeImageId;
    }

    public Item(String placeName, String placeDetails) {

        mPlaceName = placeName;
        mPlacedetails = placeDetails;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlacedetails() {
        return mPlacedetails;
    }

    public int getPlaceImageId() {
        return mPlaceImageId;
    }

    public boolean hasImage() {
        return mPlaceImageId != DEFAULT_ID;
    }
}
