package com.example.covtracegroup10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bayambang2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayambang2);
        Button btnBayambang=(Button)findViewById(R.id.btnBayambang);
        Button btnback=(Button)findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen = new Intent(bayambang2.this, muni2.class);
                startActivity(registerScreen);
            }
        });
    }
}