package com.example.datashare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CheckActivity extends AppCompatActivity {

    private TextView mUser, mPass, mMail, mGender;
    private Button mShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        mUser = findViewById(R.id.lbl_username);
        mPass = findViewById(R.id.lbl_pass);
        mMail = findViewById(R.id.lbl_email);
        mGender = findViewById(R.id.lbl_gender);
        mShare = findViewById(R.id.btn_share);

        Intent mIntent = getIntent();

        if (mIntent != null){
            mUser.setText(mIntent.getStringExtra("user"));
            mPass.setText(mIntent.getStringExtra("pass"));
            mMail.setText(mIntent.getStringExtra("mail"));
            mGender.setText(mIntent.getStringExtra("gender"));
        }


        mShare.setOnClickListener( view -> {
            Intent mImpIntent = new Intent();
            String text = "{ \n\t user: \""+mUser.getText().toString()+"\",\n\t pass: \""+mPass.getText().toString()+"\",\n\t email: \""+mMail.getText().toString()+"\",\n\t gender: \""+mGender.getText().toString()+"\"\n};";
            mImpIntent.setType("text/plain");
            mImpIntent.setAction(Intent.ACTION_SEND);
            mImpIntent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(mImpIntent);

        });

    }
}
