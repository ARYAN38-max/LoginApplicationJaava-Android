package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView userName = findViewById(R.id.userName);
        TextView userPassword = findViewById(R.id.userPassword);

        MaterialButton Loginbtn = (MaterialButton) findViewById(R.id.loginBtn);

        //admin and admin

        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userName.getText().toString().equals("admin") && userPassword.getText().toString().equals("admin"))

                {

                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "LOGIN FAILED",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}