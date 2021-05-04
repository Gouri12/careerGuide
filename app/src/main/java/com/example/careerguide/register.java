package com.example.careerguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {
    private Button buttonReg;
    EditText mFullName,mEmail,mPassword,mPhoneNumber;
    FirebaseAuth fAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mFullName=findViewById(R.id.fullName);
        mEmail=findViewById(R.id.email);
        mPassword=findViewById(R.id.password);
        mPhoneNumber=findViewById(R.id.phone);
        fAuth=FirebaseAuth.getInstance();
        if(fAuth.getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(),register.class));
            finish();
        }
        buttonReg = (Button) findViewById(R.id.buttonStart);
        buttonReg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String email=mEmail.getText().toString().trim();
                String password=mPassword.getText().toString().trim();
                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(password)) {
                    mPassword.setError("password is Required");
                    return;
                }
                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                       if(task.isSuccessful()) {
                           Toast.makeText(register.this, "please wait a moment", Toast.LENGTH_SHORT).show();
                           startActivity(new Intent(getApplicationContext(),official.class));
                       }
                       else {
                           Toast.makeText(register.this,"invalid user information",Toast.LENGTH_SHORT).show();
                       }
                    }
                });



            }
        });
    }
    public void openOff() {
        Intent intent = new Intent(this, official.class);
        startActivity(intent);
}}