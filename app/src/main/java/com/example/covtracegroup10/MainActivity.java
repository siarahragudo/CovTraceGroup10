package com.example.covtracegroup10;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText userName= (EditText) findViewById(R.id.etNewName);
        final EditText password= (EditText) findViewById(R.id.etNewPassword);
        final EditText email= (EditText) findViewById(R.id.etNewEmail);
        Button btnRegister = (Button) findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                String newUser = userName.getText().toString();
                String newPassword = password.getText().toString();
                String newEmail = email.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(newUser + newPassword +"data", newUser + "\n" + newEmail);
                editor.commit();

                Toast.makeText(getApplicationContext(), "You Are Now Registered!", Toast.LENGTH_SHORT).show();

                Intent loginScreen = new Intent(MainActivity.this, register2.class);
                startActivity(loginScreen);
            }
        });
    }
}