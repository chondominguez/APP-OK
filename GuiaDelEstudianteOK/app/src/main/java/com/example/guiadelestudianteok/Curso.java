package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public abstract class Curso extends AppCompatActivity {

    protected int anio;
    protected List<Materia> materias;

    public Curso(int anio, List<Materia> materias) {
        this.anio = anio;
        this.materias = materias;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);

        TextView  tvCurso = (TextView)findViewById(R.id.tv_curso);
        tvCurso.setText(this.Identificador());

        LinearLayout lyMaterias = (LinearLayout) findViewById(R.id.ly_materias);
        for (Materia m : materias) {
            TextView tvMateria = new TextView(getApplicationContext());
            tvMateria.setText(m.Datos());
            lyMaterias.addView(tvMateria);
        }
        
    }

    public abstract String Identificador();

}
