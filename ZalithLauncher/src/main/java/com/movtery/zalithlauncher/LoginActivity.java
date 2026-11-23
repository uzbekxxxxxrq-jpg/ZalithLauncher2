package com.movtery.zalithlauncher;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if (TextUtils.isEmpty(username)) {
                    etUsername.setError("Foydalanuvchi nomini kiriting");
                    etUsername.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    etPassword.setError("Parolni kiriting");
                    etPassword.requestFocus();
                    return;
                }

                // Bu yerda akkaunt yaratish yoki kirish mantiqini yozasiz
                Toast.makeText(LoginActivity.this, "Xush kelibsiz, " + username + "!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
