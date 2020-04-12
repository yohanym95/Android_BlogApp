package com.example.yohan.blogapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitArrayAPI {

    @GET("posts?per_page=15&_embed")
    Call<List<WPPost>> getPostInfo();

    @GET("posts?per_page=15&_embed")
    Call<List<WPPost>> getEngPostInfo();

    @GET("posts?categories=766&per_page=15&_embed")
    Call<List<WPPost>> getJavaPost();

    @GET("posts?categories=757&per_page=15&_embed")
    Call<List<WPPost>> getAngularPost();

    @GET("posts?categories=273&_embed")
    Call<List<WPPost>> getFiverPost();

    @GET("posts?categories=185&per_page=15&_embed")
    Call<List<WPPost>> getGitPost();

    @GET("posts?categories=930&per_page=15&_embed")
    Call<List<WPPost>> getHTMLPost();

    @GET("posts?categories=102&per_page=15&_embed")
    Call<List<WPPost>> getKotlinPost();

    @GET("posts?categories=943&_embed")
    Call<List<WPPost>> getLaravelPost();

    @GET("posts?categories=17&per_page=15&_embed")
    Call<List<WPPost>> getNetworkingPost();

    @GET("posts?categories=917&per_page=15&_embed")
    Call<List<WPPost>> getPHPPost();

    @GET("posts?categories=753&per_page=15&_embed")
    Call<List<WPPost>> getUnityPost();

    @GET("posts?categories=35&per_page=15&_embed")
    Call<List<WPPost>> getMoviesPost();

    @GET("posts?categories=807&per_page=15&_embed")
    Call<List<WPPost>> getAnimationPost();

    @GET("posts?categories=64&per_page=15&_embed")
    Call<List<WPPost>> getGamesPost();

    @GET("posts?categories=57&_embed")
    Call<List<WPPost>> getSportPost();

    @GET("posts?categories=273&_embed")
    Call<List<WPJavaPost>> getTechEnglishPost();

    @GET("posts?categories=218&_embed")
    Call<List<WPPost>> getTechTamilPost();

    @GET("posts?categories=38&_embed")
    Call<List<WPPost>> getTechSinhalaPost();

    @GET("posts?categories=98&_embed")
    Call<List<WPJavaPost>> getTechnologyPost();

    @GET("posts?categories=195&per_page=15&_embed")
    Call<List<WPPost>> getKibuliPost();

    @GET("posts?categories=975&per_page=15&_embed")
    Call<List<WPPost>> getReactNativePost();

    @GET("posts?categories=376&per_page=15&_embed")
    Call<List<WPPost>> getOtherPost();

    @GET("posts?categories=1366&per_page=15&_embed")
    Call<List<WPPost>> getLaraPost();

    @GET("posts?categories=39&per_page=15&_embed")
    Call<List<WPPost>> getPythonPost();

    @GET("posts?categories=1106&per_page=15&_embed")
    Call<List<WPPost>> getArduinoPost();

    @GET("posts?categories=5&per_page=15&_embed")
    Call<List<WPPost>> getCloudPost();

    @GET("posts?categories=33&per_page=15&_embed")
    Call<List<WPPost>> getEngDevicePost();

    @GET("posts?categories=10&per_page=15&_embed")
    Call<List<WPPost>> getEngGitPost();

    @GET("posts?categories=129&per_page=15&_embed")
    Call<List<WPPost>> getEngJavascriptPost();

    @GET("posts?categories=148&per_page=15&_embed")
    Call<List<WPPost>> getEngLawBasicsPost();

    @GET("posts?categories=3&per_page=15&_embed")
    Call<List<WPPost>> getEngTechNewsPost();

    @GET("posts?categories=952&per_page=15&_embed")
    Call<List<WPPost>> getAndroidNewsPost();

    @GET("posts?categories=1310&per_page=15&_embed")
    Call<List<WPPost>> getXMLPost();

    @GET("posts?categories=248&per_page=15&_embed")
    Call<List<WPPost>> getFlutterPost();

    //News - update
    @GET("api/get-current-statistical/")
    Call<CoronaPost> getNewsCorona();

    //english
    @GET("posts?categories=287&per_page=15&_embed")
    Call<List<WPPost>> getEnglishForLife();

    //english
    @GET("posts?categories=268&per_page=15&_embed")
    Call<List<WPPost>> getML();


    //sinhala
    @GET("posts?categories=1395&per_page=15&_embed")
    Call<List<WPPost>> getPythonSinhala();

//    @GET("posts?categories=33&per_page=15&_embed")
//    Call<List<WPPost>> getEngTechNewsPostGadget();

}
