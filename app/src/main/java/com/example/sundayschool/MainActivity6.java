package com.example.sundayschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity8();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity9();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity10();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity11();
            }
        });
    }

    private void openActivity11() {
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }

    private void openActivity10() {
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }

    private void openActivity9() {
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);
    }

    private void openActivity8() {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}
