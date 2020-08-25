package com.t3h.myapplication;

import android.app.Application;

public class MyApplication extends Application {

    private String name;
    private int age;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
