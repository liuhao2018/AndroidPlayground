package com.example.liuhao.androidplayground.litho;

import android.app.Application;

import com.facebook.soloader.SoLoader;

/**
 * Created by liuhao on 2017/5/3.
 */

public class LithoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this,false);
    }
}
