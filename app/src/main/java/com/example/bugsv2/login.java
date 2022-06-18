package com.example.bugsv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private EditText loginEmail,loginPassword;
    private Button signIn,backSignIn,forgetPass;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        loginEmail = findViewById(R.id.loginEmail);
        loginPassword = findViewById(R.id.loginPassword);
        signIn = findViewById(R.id.signIn);
        backSignIn = findViewById(R.id.backSignIn);
        forgetPass = findViewById(R.id.forgetPass);

        forgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this,forgetPassword.class));
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

        backSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this,MainActivity.class));
            }
        });

    }

    private void login() {

        String emailUser = loginEmail.getText().toString().trim();
        String passUser = loginPassword.getText().toString().trim();

        if(emailUser.isEmpty()){
            loginEmail.setError("Email field cannot be empty");
            loginEmail.requestFocus();
            return;
        }
        if(passUser.isEmpty()){
            loginPassword.setError("Password field cannot be empty");
        }
        else{
            mAuth.signInWithEmailAndPassword(emailUser,passUser).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(login.this,"Login successful", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(login.this, homepage.class));
                    }else{
                        Toast.makeText(login.this,"Login failed",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}