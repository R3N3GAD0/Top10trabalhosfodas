package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int pre = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.botao);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendEmail = new Intent(Intent.ACTION_SEND);
                sendEmail.putExtra(Intent.EXTRA_EMAIL, "igabrielsb9@gmail.com");
                sendEmail.putExtra(Intent.EXTRA_TEXT, "Bora da um 2");
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Bolonha");

                if(sendEmail.resolveActivity(getPackageManager()) != null) {
                startActivity(sendEmail);
                }
            }
        });
    }



    }


