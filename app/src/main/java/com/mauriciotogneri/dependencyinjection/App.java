package com.mauriciotogneri.dependencyinjection;

import android.app.Application;

import com.mauriciotogneri.dependencyinjection.di.ServiceLocator;

public class App extends Application
{
    public static ServiceLocator New;

    @Override
    public void onCreate()
    {
        super.onCreate();

        New = new DefaultServiceLocator(getApplicationContext());
    }
}