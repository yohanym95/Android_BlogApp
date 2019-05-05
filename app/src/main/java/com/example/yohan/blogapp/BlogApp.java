package com.example.yohan.blogapp;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class BlogApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
