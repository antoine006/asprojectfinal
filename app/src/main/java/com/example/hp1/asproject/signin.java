package com.example.hp1.asproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signin extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth mAuth;
 TextView tv1;
 EditText et1,et2;
 Button signin,signup;
final String TAG = "Firebase";
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
        mAuth = FirebaseAuth.getInstance();
    }
        });
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //  updateUI(currentUser);
    }
    public void createUserWithEmailAndPassword(String email, String password){
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
        @Override
        public void onComplete(@NonNull Task<AuthResult> task) {
            if (task.isSuccessful()) {
                // Sign in success, update UI with the signed-in user's information
                Log.d(TAG, "createUserWithEmail:success");
                FirebaseUser user = mAuth.getCurrentUser();
                updateUI(user);
            } else {
                // If sign in fails, display a message to the user.
                Log.w(TAG, "createUserWithEmail:failure", task.getException());
                Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
                        Toast.LENGTH_SHORT).show();
                //updateUI(null);
            }

        }

}
    @Override
    public void onClick(View view) {

    }
}

