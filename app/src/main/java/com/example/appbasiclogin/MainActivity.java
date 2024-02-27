package com.example.appbasiclogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView edtUsername, edtPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtUsername.getText().toString().trim().equals("duongdh") &&
                edtPassword.getText().toString().trim().equals("123456")) {
                    Intent intent = new Intent(getApplicationContext(), Secondary.class);
                    intent.putExtra("user", edtUsername.getText().toString().trim());
                    intent.putExtra("password", edtPassword.getText().toString().trim());
                    startActivity(intent);
                }
            }
        });
    }

    private void AnhXa() {
        edtUsername = findViewById(R.id.editUsername);
        edtPassword = findViewById(R.id.editPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }
}