package ru.trait.chatapp;


import android.app.Application;

import com.parse.Parse;

/**
 * Created by Павел on 18.05.2016.
 */
public class ChatApp extends Application {

    @Override
             public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YOUR_APP_ID")
                .server("http://YOUR_PARSE_SERVER:1337/parse")

        .build()
        );
    }
}
