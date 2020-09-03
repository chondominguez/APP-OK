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
        Intent i = new Intent(this, MenuEspecialidades.class);
        startActivity(i);
    }

    public void IrACicloBasico(View view){
        Intent l = new Intent(this, MenuCicloBasico.class);
        startActivity(l);
    }

}
