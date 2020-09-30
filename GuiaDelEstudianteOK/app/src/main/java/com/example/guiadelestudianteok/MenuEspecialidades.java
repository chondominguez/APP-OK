package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuEspecialidades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_especialidades);
    }

    public void IrAComputacion(View view){
        Intent l = new Intent(this, Computacion.class);
        startActivity(l);
    }

    public void IrAConstrucciones(View view){
        Intent l = new Intent(this, Construcciones.class);
        startActivity(l);
    }

    public void IrAElectrica(View view){
        Intent l = new Intent(this, Electrica.class);
        startActivity(l);
    }

    public void IrAElectronica(View view){
        Intent l = new Intent(this, Electronica.class);
        startActivity(l);
    }

    public void IrAMecanica(View view){
        Intent l = new Intent(this,Mecanica.class);
        startActivity(l);
    }

    public void IrAQuimica(View view){
        Intent l = new Intent(this,Quimica.class);
        startActivity(l);
    }

    public void IrAInicio(View view){
        Intent l = new Intent(this, MainActivity.class);
        startActivity(l);
    }

}
