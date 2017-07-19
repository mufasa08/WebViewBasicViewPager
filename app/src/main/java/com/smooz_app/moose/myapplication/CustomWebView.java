package com.smooz_app.moose.myapplication;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/**
 * Created by Mustafa on 6/6/2017.
 */

public class CustomWebView extends WebView {
    CustomWebView webView;

    public CustomWebView(Context context) {
        super(context);
        webView=this;
    }

    public CustomWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }





}