package com.example.yohan.blogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RecentPostView extends AppCompatActivity {

    private WebView recentpostWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_post_view);

        recentpostWebView = findViewById(R.id.recent_postwebview);

        Intent i = getIntent();
        String renderContent = i.getStringExtra(RecentFragment.RENDER_CONTENT);
        String renderContent1 = i.getStringExtra(JavaPost.RENDER_CONTENT);
        String renderContent2 = i.getStringExtra(AngularPost.RENDER_CONTENT);
        String renderContent3 = i.getStringExtra(FiverrPost.RENDER_CONTENT);
        String renderContent4 = i.getStringExtra(GitPosts.RENDER_CONTENT);
        String renderContent5 = i.getStringExtra(HtmlPost.RENDER_CONTENT);
        String renderContent6 = i.getStringExtra(KotlinPost.RENDER_CONTENT);


        if(renderContent != null){
            String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
            String body = "<html>"+head+"<body>"+renderContent+"</body></html>";
            String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
            //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

            //  WebSettings webSettings = recentpostWebView.getSettings();
            recentpostWebView.setWebViewClient(new WebViewClient());
            recentpostWebView.getSettings().setJavaScriptEnabled(true);
            recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
            recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
            recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
            recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
            // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
            // webView.getSettings().setLoadWithOverviewMode(true);
            // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            //  recentpostWebView.getSettings().setUseWideViewPort(true);
            recentpostWebView.getSettings().setSupportZoom(true);
            recentpostWebView.getSettings().setBuiltInZoomControls(true);
            recentpostWebView.getSettings().setDisplayZoomControls(true);
            recentpostWebView.loadData(bodyrender,"text/html","base64");
        }else if(renderContent1 != null){
            String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
            String body = "<html>"+head+"<body>"+renderContent1+"</body></html>";
            String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
            //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

            //  WebSettings webSettings = recentpostWebView.getSettings();
            recentpostWebView.setWebViewClient(new WebViewClient());
            recentpostWebView.getSettings().setJavaScriptEnabled(true);
            recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
            recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
            recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
            recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
            // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
            // webView.getSettings().setLoadWithOverviewMode(true);
            // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            //  recentpostWebView.getSettings().setUseWideViewPort(true);
            recentpostWebView.getSettings().setSupportZoom(true);
            recentpostWebView.getSettings().setBuiltInZoomControls(true);
            recentpostWebView.getSettings().setDisplayZoomControls(true);
            recentpostWebView.loadData(bodyrender,"text/html","base64");
        }else if(renderContent2 != null){
            String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
            String body = "<html>"+head+"<body>"+renderContent2+"</body></html>";
            String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
            //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

            //  WebSettings webSettings = recentpostWebView.getSettings();
            recentpostWebView.setWebViewClient(new WebViewClient());
            recentpostWebView.getSettings().setJavaScriptEnabled(true);
            recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
            recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
            recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
            recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
            // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
            // webView.getSettings().setLoadWithOverviewMode(true);
            // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            //  recentpostWebView.getSettings().setUseWideViewPort(true);
            recentpostWebView.getSettings().setSupportZoom(true);
            recentpostWebView.getSettings().setBuiltInZoomControls(true);
            recentpostWebView.getSettings().setDisplayZoomControls(true);
            recentpostWebView.loadData(bodyrender,"text/html","base64");
        }else if(renderContent3 != null){
            String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
            String body = "<html>"+head+"<body>"+renderContent3+"</body></html>";
            String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
            //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

            //  WebSettings webSettings = recentpostWebView.getSettings();
            recentpostWebView.setWebViewClient(new WebViewClient());
            recentpostWebView.getSettings().setJavaScriptEnabled(true);
            recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
            recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
            recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
            recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
            // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
            // webView.getSettings().setLoadWithOverviewMode(true);
            // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            //  recentpostWebView.getSettings().setUseWideViewPort(true);
            recentpostWebView.getSettings().setSupportZoom(true);
            recentpostWebView.getSettings().setBuiltInZoomControls(true);
            recentpostWebView.getSettings().setDisplayZoomControls(true);
            recentpostWebView.loadData(bodyrender,"text/html","base64");
        }else if(renderContent4 != null){
            String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
            String body = "<html>"+head+"<body>"+renderContent4+"</body></html>";
            String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
            //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

            //  WebSettings webSettings = recentpostWebView.getSettings();
            recentpostWebView.setWebViewClient(new WebViewClient());
            recentpostWebView.getSettings().setJavaScriptEnabled(true);
            recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
            recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
            recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
            recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
            // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
            // webView.getSettings().setLoadWithOverviewMode(true);
            // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            //  recentpostWebView.getSettings().setUseWideViewPort(true);
            recentpostWebView.getSettings().setSupportZoom(true);
            recentpostWebView.getSettings().setBuiltInZoomControls(true);
            recentpostWebView.getSettings().setDisplayZoomControls(true);
            recentpostWebView.loadData(bodyrender,"text/html","base64");
        }else if(renderContent5 != null){
            String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
            String body = "<html>"+head+"<body>"+renderContent5+"</body></html>";
            String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
            //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

            //  WebSettings webSettings = recentpostWebView.getSettings();
            recentpostWebView.setWebViewClient(new WebViewClient());
            recentpostWebView.getSettings().setJavaScriptEnabled(true);
            recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
            recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
            recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
            recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
            // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
            // webView.getSettings().setLoadWithOverviewMode(true);
            // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            //  recentpostWebView.getSettings().setUseWideViewPort(true);
            recentpostWebView.getSettings().setSupportZoom(true);
            recentpostWebView.getSettings().setBuiltInZoomControls(true);
            recentpostWebView.getSettings().setDisplayZoomControls(true);
            recentpostWebView.loadData(bodyrender,"text/html","base64");
        }else if(renderContent6 != null){
            String head = "<head><style>img{max-width:100%;width:auto;height:auto;}</style></head>";
            String body = "<html>"+head+"<body>"+renderContent6+"</body></html>";
            String bodyrender = Base64.encodeToString(body.getBytes(),Base64.NO_PADDING);
            //  String url = "https://readhublk.com/%E0%B6%AF%E0%B6%B1%E0%B7%8A%E0%B6%B1-%E0%B7%83%E0%B7%92%E0%B6%82%E0%B7%84%E0%B6%BD%E0%B7%99%E0%B6%B1%E0%B7%8A-html-part-03/";

            //  WebSettings webSettings = recentpostWebView.getSettings();
            recentpostWebView.setWebViewClient(new WebViewClient());
            recentpostWebView.getSettings().setJavaScriptEnabled(true);
            recentpostWebView.getSettings().setLoadsImagesAutomatically(true);
            recentpostWebView.getSettings().setAllowFileAccessFromFileURLs(true);
            recentpostWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
            recentpostWebView.getSettings().setDomStorageEnabled(true);


//        recentpostWebView.getSettings().getLoadsImagesAutomatically();
            // webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
            // webView.getSettings().setLoadWithOverviewMode(true);
            // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            //  recentpostWebView.getSettings().setUseWideViewPort(true);
            recentpostWebView.getSettings().setSupportZoom(true);
            recentpostWebView.getSettings().setBuiltInZoomControls(true);
            recentpostWebView.getSettings().setDisplayZoomControls(true);
            recentpostWebView.loadData(bodyrender,"text/html","base64");
        }









    }
}
