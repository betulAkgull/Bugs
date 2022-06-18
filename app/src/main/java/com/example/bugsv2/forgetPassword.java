package com.example.bugsv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgetPassword extends AppCompatActivity {
    private Button backForgetPass, sendMail;
    private EditText mailForgetPass;
    private FirebaseAuth mAuth;
    private String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        mailForgetPass = findViewById(R.id.mailForgetPass);

        backForgetPass = findViewById(R.id.backForgetPass);
        backForgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(forgetPassword.this,login.class));
            }
        });

        mailForgetPass = findViewById(R.id.mailForgetPass);
        sendMail = findViewById(R.id.sendMail);
        sendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valideData();
            }
        });
    }

    private void valideData() {
        email = mailForgetPass.getText().toString();
        if(email.isEmpty()){
            mailForgetPass.setError("Enter your email address !");
            mailForgetPass.requestFocus();
        }else{
            forgetPass();
        }
    }

    private void forgetPass() {
        mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(forgetPassword.this, "Password recover mail has been sent, please check your email. ", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(forgetPassword.this, login.class));

                }else{
                    Toast.makeText(forgetPassword.this, "Error: " + task.getException(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}