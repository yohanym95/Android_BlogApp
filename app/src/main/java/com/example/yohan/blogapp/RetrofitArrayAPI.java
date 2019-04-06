package com.example.yohan.blogapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitArrayAPI {

    @GET("posts?per_page=10")
    Call<List<WPPost>> getPostInfo();

    @GET("posts?categories=1029")
    Call<List<WPJavaPost>> getJavaPost();

    @GET("posts?categories=1030")
    Call<List<WPJavaPost>> getAngularPost();

    @GET("posts?categories=421")
    Call<List<WPJavaPost>> getFiverPost();

    @GET("posts?categories=1039")
    Call<List<WPJavaPost>> getGitPost();

    @GET("posts?categories=1128")
    Call<List<WPJavaPost>> getHTMLPost();

    @GET("posts?categories=927")
    Call<List<WPJavaPost>> getKotlinPost();
}
