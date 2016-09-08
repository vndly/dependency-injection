package com.mauriciotogneri.dependencyinjection;

public class User
{
    public final String name;
    public final Integer age;
    public final Float weight;

    public User(String name, Integer age, Float weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String name()
    {
        return name;
    }

    public Integer age()
    {
        return age;
    }

    public Float weight()
    {
        return weight;
    }
}