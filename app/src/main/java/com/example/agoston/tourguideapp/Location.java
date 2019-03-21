package com.example.agoston.tourguideapp;

public class Location {

    private int mName;
    private int mDescription;
    private int mAddress;
    private int mPhone;
    private int mTime;
    private int mWeb;
    private int mImageResourceId;

    public Location(int name, int description, int address, int phone, int time, int web, int imageResourceId){
        mName = name;
        mDescription = description;
        mAddress = address;
        mPhone = phone;
        mTime = time;
        mWeb = web;
        mImageResourceId = imageResourceId;
    }

    public int getName() {
        return mName;
    }

    public int getDescription() {
        return mDescription;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getPhone() {
        return mPhone;
    }

    public int getTime() {
        return mTime;
    }

    public int getWeb() {
        return mWeb;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


    @Override
    public String toString(){
        String output = getName() + "\n" + getDescription() + "\n" + getAddress() + "\n" + getTime() + "\n" + getPhone() + "\n" + getWeb();
        return output;
    }
}