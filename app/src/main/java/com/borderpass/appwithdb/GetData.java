package com.borderpass.appwithdb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GetData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);
    }

    public void startMainActivity(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
