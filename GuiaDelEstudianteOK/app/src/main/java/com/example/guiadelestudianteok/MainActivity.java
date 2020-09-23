package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void IrAMenuEspecialidades(View view){
        Intent l = new Intent(this, MenuEspecialidades.class);
        startActivity(l);
    }

    public void IrACicloBasico(View view){
        Intent l = new Intent(this, MenuCicloBasico.class);
        startActivity(l);
    }

    public void IrAContacto(View view){
        Intent l = new Intent(this, Contact.class);
        startActivity(l);
    }

    public void IrADevelopers(View view){
        Intent l = new Intent(this, Developers.class);
        startActivity(l);
    }

    public void IrAInicio(View view){
        Intent l = new Intent(this, MainActivity.class);
        startActivity(l);
    }

}
