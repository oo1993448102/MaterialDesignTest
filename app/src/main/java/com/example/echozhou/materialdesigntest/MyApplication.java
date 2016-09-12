package com.example.echozhou.materialdesigntest;

import android.app.Application;

/**
 * Created by EchoZhou on 2016/9/9.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        GlobalParams.appContext = getApplicationContext();
    }
}
