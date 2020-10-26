package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("IKDgY5e2c7lO3Z0movGGni0Te45vwE36Ku5XtPj5")
                .clientKey("B7QV6hklGkTIqjvsqMa3IzEBJqM8ibIpynOImMBS")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
