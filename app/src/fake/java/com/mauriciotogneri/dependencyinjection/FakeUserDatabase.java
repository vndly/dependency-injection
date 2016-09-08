package com.mauriciotogneri.dependencyinjection;


import com.mauriciotogneri.dependencyinjection.di.UserDatabase;

import java.util.ArrayList;
import java.util.List;

public class FakeUserDatabase implements UserDatabase
{
    @Override
    public List<User> users()
    {
        List<User> users = new ArrayList<>();
        users.add(new User("Fake user 1", 11, 11f));
        users.add(new User("Fake user 2", 22, 22f));
        users.add(new User("Fake user 3", 33, 33f));

        return users;
    }
}