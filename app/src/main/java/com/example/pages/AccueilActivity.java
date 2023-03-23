package com.example.pages;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class AccueilActivity extends Activity {
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil_activity);
        textView=findViewById(R.id.username);
        Intent intent= getIntent();
        String user = intent.getStringExtra("username");
        textView.setText(user);
    }
}
