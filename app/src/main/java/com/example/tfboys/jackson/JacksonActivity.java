package com.example.tfboys.jackson;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tfboys.R;

public class JacksonActivity extends AppCompatActivity {

    Button jackson;

    int c;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jackson);
        getSupportActionBar().hide();

        c = 1;
        initView();
        initEvent();
    }



    private void initEvent() {

        jackson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JacksonActivity.this, JackActivity.class);
                startActivity(intent);
            }
        });


    }


    private void initView() {

        jackson = findViewById(R.id.jj);


    }

}





