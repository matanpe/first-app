package com.example.entername;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnNext =findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);

        // Getting the name
        Intent intent1 = getIntent();
        String receivedMessage1 = intent1.getStringExtra("name1");
        TextView tvName1 = findViewById(R.id.tvName);
        tvName1.setText(receivedMessage1);

        // Getting the password
        Intent intent2 = getIntent();
        String receivedMessage2 = intent2.getStringExtra("pass");
        TextView tvPass = findViewById(R.id.tvPass);
        tvPass.setText(receivedMessage2);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
