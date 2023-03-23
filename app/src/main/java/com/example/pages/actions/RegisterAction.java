package com.example.pages.actions;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pages.MainActivity;
import com.example.pages.RegisterActivity;
import com.example.pages.model.User;

public class RegisterAction implements View.OnClickListener{
    private RegisterActivity registerActivity;

    private EditText nameInput;
    private EditText phoneInput;
    private EditText emailInput;
    private EditText passwordInput;

    RegisterAction(RegisterActivity registerActivity){
        this.registerActivity = registerActivity;
        nameInput = registerActivity.getName();
        phoneInput = registerActivity.getPhone();
        emailInput = registerActivity.getEmail();
        passwordInput = registerActivity.getPassword();
    }

    @Override
    public void onClick(View view) {
        if (emailInput.getText().toString().equals("") ||
                passwordInput.getText().toString().equals("") ||
                phoneInput.getText().toString().equals("") ||
                nameInput.getText().toString().equals("")) {
            Toast.makeText(registerActivity, "all fields are required",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        // registration
        String name = registerActivity.getServices().getUser(String.valueOf(emailInput.getText()));
        if (name == null) {
            User user = new User(String.valueOf(nameInput.getText()),
                    String.valueOf(phoneInput.getText()),
                    String.valueOf(emailInput.getText()),
                    String.valueOf(passwordInput.getText()));
            registerActivity.getServices().setUser(user);
            Intent intent = new Intent(registerActivity, MainActivity.class);
            intent.putExtra("user", user);
            registerActivity.startActivity(intent);
            registerActivity.finish();
        }
        // Toast.makeText(mainActivity, "Hi"+user.getName(), Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(registerActivity, "error", Toast.LENGTH_SHORT).show();
    }
}
