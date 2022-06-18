package com.example.bugsv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class signup2 extends AppCompatActivity {
    private EditText name, surname,email,birthday,password,password2;
    private Button button2,signUp;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        name = findViewById(R.id.editTextTextPersonName);
        surname = findViewById(R.id.editTextTextPersonSurname);
        email = findViewById(R.id.loginEmail);
        birthday = findViewById(R.id.editTextBirthday);
        password = findViewById(R.id.loginPassword);
        password2 = findViewById(R.id.editTextTextPassword2);
        signUp = (Button) findViewById(R.id.signUpButton);
        mAuth = FirebaseAuth.getInstance();
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(signup2.this,MainActivity.class));
            }
        });


        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });
    }

    private void registerUser() {

        String uName = name.getText().toString().trim();
        String uSurname = surname.getText().toString().trim();
        String uEmail = email.getText().toString().trim();
        String uBirthday = birthday.getText().toString().trim();
        String uPassword = password.getText().toString().trim();
        String uPassword2 = password2.getText().toString().trim();

        if(TextUtils.isEmpty(uName)){
            name.setError("Name is required !");
            name.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(uEmail).matches()){
            email.setError("Please provide valid email address!");
            email.requestFocus();
            return;
        }
        if(TextUtils.isEmpty(uPassword)){
            password.setError("Password is required !");
            password.requestFocus();
            return;
        }
        if(!uPassword.isEmpty() && uPassword.length()<8){
            password.setError("Password must be >= 8 characters");
            password.requestFocus();
            return;
        }
        if(uPassword2.isEmpty()){
            password2.setError("Password confirmation is required!");
            password2.requestFocus();
            return;
        }

        if(!uPassword.toString().equals(uPassword2.toString())){
            password2.setError("Does not match with the first password!");
            password2.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(uName,uPassword)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            User user = new User(uName,uSurname,uEmail,uBirthday,uPassword);

                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid()) //gets id of the registered user
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if(task.isSuccessful()){
                                                Toast.makeText(signup2.this,"User has been registered successfully !",Toast.LENGTH_LONG).show();
                                                startActivity(new Intent(signup2.this,homepage.class));
                                            }else{
                                                Toast.makeText(signup2.this,"Failed to register ! Try Again.",Toast.LENGTH_LONG).show();
                                            }
                                        }
                                    });
                        }else{
                            Toast.makeText(signup2.this,"Failed to register",Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }

}