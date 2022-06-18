package com.example.bugsv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class profile extends AppCompatActivity {
    private Button logout;
    TextView name,surname,totalpoints;
    score score;
    private FirebaseUser user;
    private DatabaseReference dbref;
    private String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);


       /* dbref.child(userId).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                user = FirebaseAuth.getInstance().getCurrentUser();
                dbref = FirebaseDatabase.getInstance().getReference("Users");
                userId = user.getUid();
                User userprofile = snapshot.getValue(User.class);

                if(userprofile!= null){
                    String name_db = userprofile.getName();
                    String surname_db = userprofile.getSurname();

                    name.setText(name_db);
                    surname.setText(surname_db);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(profile.this, "Failed to read", Toast.LENGTH_SHORT).show();
            }
        });*/



        totalpoints = findViewById(R.id.totalPoints);
        totalpoints.setText(score.getScore());

        logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //FirebaseAuth.getInstance().signOut();
                Toast.makeText(profile.this,"Logged out",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(profile.this,MainActivity.class));
            }
        });
    }
}