package com.example.datashare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GetDataActivity extends AppCompatActivity {

    private TextView mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

        mData = findViewById(R.id.share_data);
        Intent mIntent = getIntent();

        if (mIntent != null){
            mData.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
