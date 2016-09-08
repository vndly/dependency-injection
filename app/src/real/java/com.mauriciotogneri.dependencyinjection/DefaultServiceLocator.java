package com.mauriciotogneri.dependencyinjection;

import android.content.Context;

import com.mauriciotogneri.dependencyinjection.di.ServiceLocator;
import com.mauriciotogneri.dependencyinjection.services.DefaultUserDatabase;

public class DefaultServiceLocator implements ServiceLocator
{
    public DefaultServiceLocator(Context context)
    {
        System.out.println();
    }

    @Override
    public DefaultUserDatabase userDatabase()
    {
        return new DefaultUserDatabase();
    }
}