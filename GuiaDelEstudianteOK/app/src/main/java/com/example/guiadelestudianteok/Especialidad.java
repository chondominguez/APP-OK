package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.Exception;


public abstract class Especialidad extends AppCompatActivity {
    protected int nombre;
    protected String descripcion;
    protected int escudo;
    protected Class[] anios;


    Especialidad(int nombre, String descripcion, int escudo, Class[] anios){

        this.anios = anios;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.escudo = escudo;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especialidad);

        TextView tvNombre = (TextView)findViewById(R.id.txv_NombreEsp);
        tvNombre.setText(getString(nombre));
        ImageView imgEscudo = (ImageView)findViewById(R.id.img_Escudo);
        imgEscudo.setImageResource(escudo);
        TextView tvDescripcion = (TextView)findViewById(R.id.txv_Descripcion);
        tvDescripcion.setText(descripcion);
    }

    public void IrATercero(View view){
        Intent l = new Intent(this, anios[0]);
        startActivity(l);
    }

    public void IrACuarto(View view){
        Intent l = new Intent(this, anios[1]);
        startActivity(l);
    }

    public  void IrAQuinto(View view){
        Intent l =new Intent(this, anios[2]);
        startActivity(l);
    }

    public void IrASexto(View view){
        Intent l = new Intent(this,anios[3]);
        startActivity(l);
    }

    public void IrAInicio(View view){
        Intent l = new Intent(this, MainActivity.class);
        startActivity(l);
    }

    public void Volver(View view){
        onBackPressed();
    }
}
