package com.example.datashare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mUser, mPass, mMail, mGender;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser = findViewById(R.id.txt_user);
        mPass = findViewById(R.id.txt_pass);
        mMail = findViewById(R.id.txt_email);
        mGender = findViewById(R.id.txt_gender);
        mButton = findViewById(R.id.btn_enviar);

        mButton.setOnClickListener( view -> {
            String user = mUser.getText().toString();
            String pass = mPass.getText().toString();
            String mail = mMail.getText().toString();
            String gender = mGender.getText().toString();

            Intent mIntent = new Intent(MainActivity.this, CheckActivity.class);

            mIntent.putExtra("user", user);
            mIntent.putExtra("pass", pass);
            mIntent.putExtra("mail", mail);
            mIntent.putExtra("gender", gender);

            startActivity(mIntent);

        });

    }
}
