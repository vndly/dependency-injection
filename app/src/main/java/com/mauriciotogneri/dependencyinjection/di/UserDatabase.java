package com.mauriciotogneri.dependencyinjection.di;

import com.mauriciotogneri.dependencyinjection.User;

import java.util.List;

public interface UserDatabase
{
    List<User> users();
}