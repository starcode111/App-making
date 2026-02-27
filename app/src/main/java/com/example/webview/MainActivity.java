package com.example.webview;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            // Initialize Mobile Ads SDK
            MobileAds.initialize(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // Setup WebView
            webView = findViewById(R.id.webView);
            if (webView != null) {
                webView.setWebViewClient(new WebViewClient());
                
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setDatabaseEnabled(true);
                settings.setGeolocationEnabled(true);
                settings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
                settings.setUserAgentString("Mozilla/5.0 (Linux; Android " + Build.VERSION.RELEASE + ") AppleWebKit/537.36");
                
                webView.loadUrl("https://awmkkj.rf.gd");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // Setup AdView (Banner Ad)
            mAdView = findViewById(R.id.adView);
            if (mAdView != null) {
                AdRequest adRequest = new AdRequest.Builder().build();
                mAdView.loadAd(adRequest);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
