package com.example.pikpok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void Login(View view) {
        startActivity(new Intent(SignUpActivity.this,LoginActivity.class));
        finish();
    }

    public void login(View view) {
        startActivity(new Intent(SignUpActivity.this,ProfileActivity2.class));
        finish();
    }
}