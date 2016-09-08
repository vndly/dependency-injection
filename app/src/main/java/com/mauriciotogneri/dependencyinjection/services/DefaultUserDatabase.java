package com.mauriciotogneri.dependencyinjection.services;

import com.mauriciotogneri.dependencyinjection.User;
import com.mauriciotogneri.dependencyinjection.di.UserDatabase;

import java.util.ArrayList;
import java.util.List;

public class DefaultUserDatabase implements UserDatabase
{
    @Override
    public List<User> users()
    {
        List<User> users = new ArrayList<>();
        users.add(new User("Peter Johnson", 42, 78.4f));
        users.add(new User("Megan Brown", 36, 70.1f));
        users.add(new User("Bob Smith", 56, 85.9f));

        return users;
    }
}