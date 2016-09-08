package com.mauriciotogneri.dependencyinjection;

import android.content.Context;

import com.mauriciotogneri.dependencyinjection.di.ServiceLocator;
import com.mauriciotogneri.dependencyinjection.di.UserDatabase;

public class DefaultServiceLocator implements ServiceLocator
{
    public DefaultServiceLocator(Context context)
    {
    }

    @Override
    public UserDatabase userDatabase()
    {
        return new FakeUserDatabase();
    }
}