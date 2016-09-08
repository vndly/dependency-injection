package com.mauriciotogneri.dependencyinjection;

import android.content.Context;

import com.mauriciotogneri.dependencyinjection.di.ServiceLocator;
import com.mauriciotogneri.dependencyinjection.services.DefaultUserDatabase;

public class DefaultServiceLocator implements ServiceLocator
{
    private final Context context;

    public DefaultServiceLocator(Context context)
    {
        this.context = context;
    }

    @Override
    public DefaultUserDatabase userDatabase()
    {
        return new DefaultUserDatabase();
    }
}