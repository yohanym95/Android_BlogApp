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

    @GET("posts?categories=913")
    Call<List<WPJavaPost>> getLaravelPost();

    @GET("posts?categories=240")
    Call<List<WPJavaPost>> getNetworkingPost();

    @GET("posts?categories=1112")
    Call<List<WPJavaPost>> getPHPPost();

    @GET("posts?categories=928")
    Call<List<WPJavaPost>> getUnityPost();

    @GET("posts?categories=95")
    Call<List<WPJavaPost>> getMoviesPost();

    @GET("posts?categories=1064")
    Call<List<WPJavaPost>> getAnimationPost();

    @GET("posts?categories=366")
    Call<List<WPJavaPost>> getGamesPost();

    @GET("posts?categories=139")
    Call<List<WPJavaPost>> getSportPost();

    @GET("posts?categories=273")
    Call<List<WPJavaPost>> getTechEnglishPost();

    @GET("posts?categories=381")
    Call<List<WPJavaPost>> getTechTamilPost();

    @GET("posts?categories=196")
    Call<List<WPJavaPost>> getTechSinhalaPost();

    @GET("posts?categories=98")
    Call<List<WPJavaPost>> getTechnologyPost();

    @GET("posts?categories=752")
    Call<List<WPJavaPost>> getKibuliPost();

    @GET("posts?categories=1038")
    Call<List<WPJavaPost>> getOtherPost();


}
