package com.example.admin.realtimeproject;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RTproject extends AppCompatActivity {
    private FirebaseAuth mAuth;
    @Override
            protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtproject);
        mAuth=FirebaseAuth.getInstance();
        mAuth.createUserWithEmailAndPassword("sahithishivani111@gmail.com","momdadsis189")
           .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
    @Override
    public void onComplete(@NonNull Task<AuthResult> task) {
            if (task.isSuccessful()) {
                Log.d("TAG", "createUserWithEmail:success");
                FirebaseUser user = mAuth.getCurrentUser();


            } else {
                // If sign in fails, display a message to the user.
                Log.w("TAG", "createUserWithEmail:failure", task.getException());
                Toast.makeText(RTproject.this, "Authentication failed.",
                        Toast.LENGTH_SHORT).show();

            }

            // ...
        }
    });
}

    }

