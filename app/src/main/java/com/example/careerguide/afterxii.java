package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class afterxii extends AppCompatActivity {
    private Button buttonbioxii;
    private Button buttoncompxii;
    private  Button buttoncommxii;
    private Button buttonlitxii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterxii);
        buttonbioxii = (Button) findViewById(R.id.button11);
        buttoncompxii=(Button) findViewById(R.id.button12);
        buttoncommxii=(Button)findViewById(R.id.button13);
        buttonlitxii=(Button)findViewById(R.id.button14);
        buttonbioxii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "please wait a moment", Toast.LENGTH_SHORT).show();
                openxbio();
            }
        });
        buttoncompxii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "please wait a moment", Toast.LENGTH_SHORT).show();
                openxcomp();
            }
        });
        buttoncommxii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "please wait a moment", Toast.LENGTH_SHORT).show();
                openxcomm();
            }
        });
        buttonlitxii.setOnClickListener(new View.OnClickListener() {
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