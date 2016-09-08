package com.mauriciotogneri.dependencyinjection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.mauriciotogneri.dependencyinjection.di.UserDatabase;

import static com.mauriciotogneri.dependencyinjection.App.New;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);

        UserDatabase userDatabase = New.userDatabase();

        UserAdapter userAdapter = new UserAdapter(this);
        userAdapter.addAll(userDatabase.users());

        ListView userList = (ListView) findViewById(R.id.list);
        userList.setAdapter(userAdapter);
    }
}