package com.siddhartharya.assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ItemAdder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_adder);
    }

    public void ButtonAddTask(View v){
        Intent t = new Intent(ItemAdder.this, AddData.class);
        startActivity(t);
    }
}
