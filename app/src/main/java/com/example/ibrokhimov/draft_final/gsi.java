package com.example.ibrokhimov.draft_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class gsi extends AppCompatActivity {
    WebView webview;
    public void onBackPressed(){
        if(webview.canGoBack()){
            webview.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gsi);
        webview=(WebView) this.findViewById(R.id.web);
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("http://uni.dongseo.ac.kr/gsi/");
    }
}
