package com.example.gudang;

import static com.example.gudang.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText username, password;
    private Button button;
    private String user = "user";
    private String pass="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(id.password);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equalsIgnoreCase(user) && password.getText().toString().equalsIgnoreCase(pass)) {
                    Intent login = new Intent(login.this,main_menu. class);
                    startActivity(login);

                    Toast.makeText(login.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(login.this,"username atau passoword salah",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}