package com.example.covtracegroup10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mapandan5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapandan5);
        Button btnMangatarem=(Button)findViewById(R.id.btnMangatarem);
        Button btnback=(Button)findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen = new Intent(mapandan5.this, muni4.class);
                startActivity(registerScreen);
            }
        });
    }
}