package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Developers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);
    }
    public void IrAInicio(View view){
        Intent l = new Intent(this, MainActivity.class);
        startActivity(l);
    }
}