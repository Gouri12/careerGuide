package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class official extends AppCompatActivity {
    private Button buttonx;
    private Button buttonxii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_official);
        buttonx = (Button) findViewById(R.id.button5);
        buttonxii=(Button)findViewById(R.id.button6);
        buttonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "please wait a moment", Toast.LENGTH_SHORT).show();
                openaftxth();
            }
        });
        buttonxii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "please wait a moment", Toast.LENGTH_SHORT).show();
                openaftxiith();
            }
        });
    }
    public void openaftxth() {
        Intent intent = new Intent(this, xthfirst.class);
        startActivity(intent);
    }
    public void openaftxiith() {
        Intent intent = new Intent(this, afterxii.class);
        startActivity(intent);
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        finish();
    }
}