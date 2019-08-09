package com.example.ibrokhimov.draft_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class dsu extends AppCompatActivity {
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
        setContentView(R.layout.activity_dsu);
        webview=(WebView) this.findViewById(R.id.webv);
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("http://www.dongseo.ac.kr");
    }

}
