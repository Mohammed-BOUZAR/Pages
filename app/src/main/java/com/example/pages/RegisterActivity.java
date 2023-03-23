package com.example.pages;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.pages.business.Services;

public class RegisterActivity extends Activity {
    private EditText name;
    private EditText phone;
    private EditText email;
    private EditText password;
    private Services services;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

    public EditText getName() {
        return name;
    }

    public EditText getPhone() {
        return phone;
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
