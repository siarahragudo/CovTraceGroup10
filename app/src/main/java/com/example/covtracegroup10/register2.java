package com.example.covtracegroup10;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        final EditText username= (EditText) findViewById(R.id.username);
        final EditText password= (EditText) findViewById(R.id.password);
        Button btnRegister= (Button) findViewById(R.id.btnRegister);
        Button btnlogin = (Button) findViewById(R.id.btnlogin);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                String newUser = username.getText().toString();
                String newPassword = password.getText().toString();


                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(newUser + newPassword +"data", newUser + "\n");
                editor.commit();

                Toast.makeText(getApplicationContext(), "log in!", Toast.LENGTH_SHORT).show();

                Intent loginScreen = new Intent(register2.this, muni1.class);
                startActivity(loginScreen);
            }
        });


    }
}
