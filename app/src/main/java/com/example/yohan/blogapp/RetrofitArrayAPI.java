package com.example.yohan.blogapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitArrayAPI {

    @GET("posts?per_page=15&_embed")
    Call<List<WPPost>> getPostInfo();

    @GET("posts?categories=1029&per_page=15&_embed")
    Call<List<WPJavaPost>> getJavaPost();

    @GET("posts?categories=1030&per_page=15&_embed")
    Call<List<WPJavaPost>> getAngularPost();

    @GET("posts?categories=421&_embed")
    Call<List<WPJavaPost>> getFiverPost();

    @GET("posts?categories=1039&per_page=15&_embed")
    Call<List<WPJavaPost>> getGitPost();

    @GET("posts?categories=1128&per_page=15&_embed")
    Call<List<WPJavaPost>> getHTMLPost();

    @GET("posts?categories=927&per_page=15&_embed")
    Call<List<WPJavaPost>> getKotlinPost();

    @GET("posts?categories=913&_embed")
    Call<List<WPJavaPost>> getLaravelPost();

    @GET("posts?categories=240&per_page=15&_embed")
    Call<List<WPJavaPost>> getNetworkingPost();

    @GET("posts?categories=1112&per_page=15&_embed")
    Call<List<WPJavaPost>> getPHPPost();

    @GET("posts?categories=928&per_page=15&_embed")
    Call<List<WPJavaPost>> getUnityPost();

    @GET("posts?categories=95&per_page=15&_embed")
    Call<List<WPJavaPost>> getMoviesPost();

    @GET("posts?categories=1064&per_page=15&_embed")
    Call<List<WPJavaPost>> getAnimationPost();

    @GET("posts?categories=366&per_page=15&_embed")
    Call<List<WPJavaPost>> getGamesPost();

    @GET("posts?categories=139&_embed")
    Call<List<WPJavaPost>> getSportPost();

    @GET("posts?categories=273&_embed")
    Call<List<WPJavaPost>> getTechEnglishPost();

    @GET("posts?categories=381&_embed")
    Call<List<WPJavaPost>> getTechTamilPost();

    @GET("posts?categories=196&_embed")
    Call<List<WPJavaPost>> getTechSinhalaPost();

    @GET("posts?categories=98&_embed")
    Call<List<WPJavaPost>> getTechnologyPost();

    @GET("posts?categories=752&per_page=15&_embed")
    Call<List<WPJavaPost>> getKibuliPost();

    @GET("posts?categories=1038&_embed")
    Call<List<WPJavaPost>> getOtherPost();


}
