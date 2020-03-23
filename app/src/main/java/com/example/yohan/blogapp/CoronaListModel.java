package com.example.yohan.blogapp;

public class CoronaListModel {

    public String title,totalCount,totalLocal,totalForiegn;


    public CoronaListModel(){

    }

    public CoronaListModel(String title, String totalCount, String totalLocal, String totalForiegn) {
        this.title = title;
        this.totalCount = totalCount;
        this.totalLocal= totalLocal;
        this.totalForiegn = totalForiegn;
    }
}
