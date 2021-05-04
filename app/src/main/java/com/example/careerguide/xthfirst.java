package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import  android.view.View;
import android.widget.Toast;

public class xthfirst extends AppCompatActivity {
    private Button buttonbio;
    private Button buttoncomp;
    private  Button buttoncomm;
    private Button buttonlit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xthfirst);
        buttonbio = (Button) findViewById(R.id.button7);
        buttoncomp=(Button) findViewById(R.id.button8);
        buttoncomm=(Button)findViewById(R.id.button9);
        buttonlit=(Button)findViewById(R.id.button11x);
        buttonbio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "please wait a moment", Toast.LENGTH_SHORT).show();
                openxbio();
            }
        });
        buttoncomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "please wait a moment", Toast.LENGTH_SHORT).show();
                openxcomp();
            }
        });
        buttoncomm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "please wait a moment", Toast.LENGTH_SHORT).show();
                openxcomm();
            }
        });
        buttonlit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "please wait a moment", Toast.LENGTH_SHORT).show();
                openxlit();
            }
        });
    }
    public void openxbio() {
        Intent intent = new Intent(this, xbio.class);
        startActivity(intent);
    }

    public void openxcomp() {
        Intent intent = new Intent(this, xcomp.class);
        startActivity(intent);
    }
    public void openxcomm() {
        Intent intent = new Intent(this, xcomm.class);
        startActivity(intent);
    }
    public void openxlit() {
        Intent intent = new Intent(this, xlit.class);
        startActivity(intent);
    }

}