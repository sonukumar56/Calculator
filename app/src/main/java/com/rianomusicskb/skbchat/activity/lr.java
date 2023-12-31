package com.rianomusicskb.skbchat.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.rianomusicskb.skbchat.R;

public class lr extends AppCompatActivity {
    FirebaseAuth auth;

    Button lrlogin,lrreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lr);
        lrlogin=findViewById(R.id.lr_login);
        lrreg=findViewById(R.id.lr_reg);

        auth= FirebaseAuth.getInstance();

        if(auth.getCurrentUser()!=null){
            Intent intent = new Intent(lr.this, contacts.class);
            startActivity(intent);
            finish();
        }


        lrlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(lr.this,login.class));
                finish();

            }
        });

        lrreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(lr.this,Registration.class));
                finish();
            }
        });

    }
}