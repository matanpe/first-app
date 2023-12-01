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

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "matan";
    TextView tvEnterPassMail;
    Button btnNext;



    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnNext =findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);




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




    @Override
    public void onClick(View v) {
        String message2 = tvEnterPassMail.getText().toString().trim(); // Assuming tvName is the correct TextView


        Intent intent1 = new Intent(this, MainActivity4.class);
        intent1.putExtra("pass", message2);
        startActivity(intent1);
    }

    }
