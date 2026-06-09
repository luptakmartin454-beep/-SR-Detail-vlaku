package com.vlaky.app;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        
        // Zabezpečí, aby sa všetko otváralo vnútri našej apky a nič neodchádzalo do bielej tmy
        webView.setWebViewClient(new WebViewClient()); 
        
        setContentView(webView);
        webView.loadUrl("file:///android_asset/index.html");
    }
}
