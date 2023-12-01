package com.example.entername;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    Button btnForgotPassword;
    private static final String TAG = "shai";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnForgotPassword = findViewById(R.id.btnForgotPassword);
        btnForgotPassword.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
        Log.d(TAG, "onClick: ");
    }
}