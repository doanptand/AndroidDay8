package com.t3h.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        MyApplication application = (MyApplication) getApplication();
        String name2= application.getName();
        String name = intent.getStringExtra("key_name");
        Student student = (Student) intent.getExtras().getSerializable("key_student");
        Toast.makeText(this,"Hello " + name, Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Hello " + student.toString(), Toast.LENGTH_SHORT).show();
    }
}