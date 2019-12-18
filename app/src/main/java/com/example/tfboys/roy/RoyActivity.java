package com.example.tfboys.roy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tfboys.R;

public class RoyActivity extends AppCompatActivity  {

    Button roy;

    int c;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roy);
        getSupportActionBar().hide();

        c = 1;
        initView();
        initEvent();
    }



    private void initEvent() {

        roy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoyActivity.this, RActivity.class);
                startActivity(intent);
            }
        });


    }


    private void initView() {

        roy = findViewById(R.id.royy);


    }

}


