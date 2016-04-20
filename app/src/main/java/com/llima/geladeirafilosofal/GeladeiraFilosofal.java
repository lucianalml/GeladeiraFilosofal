package com.llima.geladeirafilosofal;

import android.app.Application;

import com.firebase.client.Firebase;

public class GeladeiraFilosofal extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }

}
