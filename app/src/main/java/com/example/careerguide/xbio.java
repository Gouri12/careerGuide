package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class xbio extends AppCompatActivity {
     private Button taketest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xbio);
        taketest = (Button) findViewById(R.id.button15);
        taketest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "please wait a moment", Toast.LENGTH_SHORT).show();
                openStartTest();
            }
        });
    }
    public void openStartTest() {
        Intent intent = new Intent(this, StartTestActivity.class);
        startActivity(intent);
    }
}