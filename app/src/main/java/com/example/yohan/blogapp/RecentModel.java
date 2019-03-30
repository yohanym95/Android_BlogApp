package com.example.yohan.blogapp;

public class RecentModel {

    public static final int IMAGE_TYPE = 1;
    public String title,date,Image;
    public String render;
    public int type;
    public static String profile;


    public RecentModel(String title, String date, String image, String render, int type) {
        this.title = title;
        this.date = date;
        this.Image = image;
        this.render = render;
        this.type = type;
    }
}
