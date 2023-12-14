package com.example.pikpok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Signup(View view) {
        startActivity(new Intent(LoginActivity.this,SignUpActivity.class));
        finish();
    }

    public void login(View view) {
        startActivity(new Intent(LoginActivity.this,ProfileActivity2.class));
        finish();
    }
}