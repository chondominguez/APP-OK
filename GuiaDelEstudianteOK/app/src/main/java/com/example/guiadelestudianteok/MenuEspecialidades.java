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
        Intent i = new Intent(this, Computacion.class);
        startActivity(i);
    }

    public void IrAConstrucciones(View view){
        Intent l = new Intent(this, Construcciones.class);
        startActivity(l);
    }

    public void IrAElectrica(View view){
        Intent n = new Intent(this, Electrica.class);
        startActivity(n);
    }

    public void IrAElectronica(View view){
        Intent k = new Intent(this, Electronica.class);
        startActivity(k);
    }

    public void IrAMecanica(View view){
        Intent m = new Intent(this,Mecanica.class);
        startActivity(m);
    }

    public void IrAQuimica(View view){
        Intent q = new Intent(this,Quimica.class);
        startActivity(q);
    }

}
