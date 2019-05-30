package com.borderpass.appwithdb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GetData extends AppCompatActivity {

    EditText productsData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

        productsData=findViewById(R.id.editText3);

        MyDBHandler dbHandler = new MyDBHandler(GetData.this);
        productsData.setText(dbHandler.loadHandler());

    }

    public void startMainActivity(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
