package com.example.lenovo_pc.registrationatphandeeyarevent;

import android.app.Application;
import android.content.Context;

/**
 * Created by lenovo-pc on 6/19/2016.
 */
public class RegistrationPhandeeyarApp extends Application
{
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
