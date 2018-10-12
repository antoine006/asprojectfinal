package com.example.hp1.asproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signin extends AppCompatActivity {
 TextView tv1;
 EditText et1,et2;
 Button signin,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
     tv1= findViewById(R.id.tv1);
     et1= findViewById(R.id.et1);
     et2= findViewById(R.id.et2);
     signin= findViewById(R.id.signin);
     signup= findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener(){

    public void onClick(View view) {
        Intent intent = new Intent(getApplication(), signup.class);
        startActivity(intent);
    }
        });
    }
}

