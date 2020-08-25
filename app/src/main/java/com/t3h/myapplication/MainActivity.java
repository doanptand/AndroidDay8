package com.t3h.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHello = findViewById(R.id.tv_hello);

        ((MyApplication) getApplication()).setName("Doan");
        ((MyApplication) getApplication()).setAge(16);
        tvHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key_name", "Doan dep trai");
                Student student = new Student("Doan", 17);
                Bundle bundle = new Bundle();
                bundle.putSerializable("key_student", student);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        tvHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String link = "https://google.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(link));
                startActivity(intent);
                return true;
            }
        });
//        Toast.makeText(getApplicationContext(),"dfgadf", Toast.LENGTH_SHORT).show();
//        Toast.makeText(this,"dfgadf", Toast.LENGTH_SHORT).show();
//        Toast.makeText(MainActivity.this,"dfgadf", Toast.LENGTH_SHORT).show();
    }
}