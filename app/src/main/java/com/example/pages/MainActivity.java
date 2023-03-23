package com.example.pages;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.pages.business.Services;


public class MainActivity extends Activity {
    private EditText email;
    private EditText password;
    private Services services;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

    public EditText getEmail() {
        return email;
    }

    public EditText getPassword() {
        return password;
    }

    public Services getServices() {
        return services;
    }
}
