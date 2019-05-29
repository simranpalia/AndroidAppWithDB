package com.borderpass.appwithdb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.borderpass.appwithdb.Product;

public class AddData extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);
        editText=findViewById(R.id.editText);
    }

    public void startMainActivity(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void saveData(View view) {

        MyDBHandler dbHandler = new MyDBHandler(this, null, null, 1);
        Product product = new Product(0, editText.getText().toString());
        dbHandler.addHandler(product);
    }
}
