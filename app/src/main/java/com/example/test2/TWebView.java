package com.example.test2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TWebView extends WebView {
    @SuppressLint("JavascriptInterface")
    public TWebView(Context context) {
        super(context);

        this.setWebViewClient(new WebViewClient());
        this.setWebChromeClient(new WebChromeClient());


        WebSettings settings = this.getSettings();
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setJavaScriptEnabled(true);

        this.addJavascriptInterface(new JsExtends(),"extends");


        this.loadUrl("http://192.168.2.215/ts/AndroidTest/template.html");

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        System.out.println(event.getAction());
        if(event.getAction() == 0){
            long now = System.currentTimeMillis();
            String cmd =  "javascript:onTouch("+event.getAction()+","+now+")";
            System.out.println(now + ":" + cmd);
            this.loadUrl(cmd);
        }

        return super.onTouchEvent(event);
    }
}

