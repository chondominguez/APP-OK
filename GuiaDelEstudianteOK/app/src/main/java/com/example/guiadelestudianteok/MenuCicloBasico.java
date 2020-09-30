package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuCicloBasico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ciclo_basico);
    }

    public void IrAPrimerAnio(View view){
        Intent l = new Intent(this, Primero.class);
        startActivity(l);
    }

    public void IrASegundoAnio(View view){
        Intent l = new Intent(this,Segundo.class);
        startActivity(l);
    }

    public void IrAInicio(View view){
        Intent l = new Intent(this, MainActivity.class);
        startActivity(l);
    }
}
