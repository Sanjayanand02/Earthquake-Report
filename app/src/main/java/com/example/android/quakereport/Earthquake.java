package com.example.android.quakereport;

public class Earthquake {
    private double magnitude;
    private String country;
    private long date;
    private String url;

    public Earthquake(double mag,String con,long da,String murl)
    {
        this.magnitude=mag;
        this.country=con;
        this.date=da;
        this.url=murl;
    }
    public String getUrl() {
        return url;
    }
    public double getMagnitude(){
        return magnitude;
    }
    public String getCountry(){
        return country;
    }
    public long getDate(){
        return date;
    }
}
