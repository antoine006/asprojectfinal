package com.example.hp1.asproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends Activity {
    TextView signup2;
    EditText etuser,etpass,etcon;
    Button btsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signup2= findViewById(R.id.signup2);
        etuser= findViewById(R.id.etuser);
        etpass= findViewById(R.id.etpass);
        etcon= findViewById(R.id.etcon);
        btsignup= findViewById(R.id.btsignup);
    }
    public void onClick(View view) {
        Intent intent = new Intent(getApplication(), signin.class);
        startActivity(intent);
    }
}
