package com.example.tfboys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tfboys.jackson.JacksonActivity;
import com.example.tfboys.karry.KarryActivity;
import com.example.tfboys.roy.RoyActivity;
import com.example.tfboys.tfboys.TfboysActivity;

public class MainActivity extends AppCompatActivity {
    Button tfboys;
    Button karry;
    Button roy;
    Button jackson;
    Button music;
    int c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        c = 1;
        initView();
        initEvent();
    }



    private void initEvent() {
        tfboys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TfboysActivity.class);
                startActivity(intent);
            }
        });

        karry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KarryActivity.class);
                startActivity(intent);
            }
        });

        roy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RoyActivity.class);
                startActivity(intent);
            }
        });

        jackson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JacksonActivity.class);
                startActivity(intent);
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Music.class);
                startActivity(intent);
            }
        });

    }

    /**
     * 找到布局(activity_main)里几个button的实例化对象
     */
    private void initView() {
        tfboys = findViewById(R.id.tfboys);
        karry = findViewById(R.id.karry);
        roy = findViewById(R.id.roy);
        jackson = findViewById(R.id.jackson);
        music = findViewById(R.id.music);

    }

}
