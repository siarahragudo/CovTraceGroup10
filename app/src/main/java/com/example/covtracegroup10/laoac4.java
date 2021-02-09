package com.example.covtracegroup10;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class laoac4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laoac4);
        Button btnLaoac=(Button)findViewById(R.id.btnLaoac);
        Button btnback=(Button)findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen = new Intent(laoac4.this, muni4.class);
                startActivity(registerScreen);
            }
        });
    }
}