package com.example.pages.actions;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pages.MainActivity;
import com.example.pages.RegisterActivity;
import com.example.pages.model.User;

public class AuthentificationAction implements View.OnClickListener {
    private MainActivity mainActivity;

    private EditText emailInput;
    private EditText passwordInput;

    AuthentificationAction(MainActivity mainActivity){
        this.mainActivity = mainActivity;
        emailInput = mainActivity.getEmail();
        passwordInput = mainActivity.getPassword();
    }

    @Override
    public void onClick(View view) {
        if (emailInput.getText().toString().equals("") || passwordInput.getText().toString().equals("") ) {
            Toast.makeText(mainActivity, "all fields are required",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        // registration
        String name = mainActivity.getServices().getUser(String.valueOf(emailInput.getText()));
        if (name != null) {
            Intent intent = new Intent(mainActivity, RegisterActivity.class);
            intent.putExtra("username", name);
            mainActivity.startActivity(intent);
            mainActivity.finish();
        }
        // Toast.makeText(mainActivity, "Hi"+user.getName(), Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(mainActivity, "error", Toast.LENGTH_SHORT).show();
    }
}
