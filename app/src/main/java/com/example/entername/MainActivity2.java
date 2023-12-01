package com.example.entername;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "matan";


    EditText etUserName;
    EditText etPassword1;
    Button btnEnter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnEnter = findViewById(R.id.btnEnter);
        btnEnter.setOnClickListener(this);
        etUserName = findViewById(R.id.etUserName);
        etPassword1 = findViewById(R.id.etPassword);

    }

    @Override
    public void onClick(View v) {

        String message1 = etUserName.getText().toString().trim();
        String message2 = etPassword1.getText().toString().trim();
        Log.d(TAG, "onClick: 111 " +message1);
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("name1", message1);
        intent.putExtra("pass", message2);
        startActivity(intent);

    }
}