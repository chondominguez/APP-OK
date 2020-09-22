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
    protected String descripcion;

    public Curso(int anio, String descripcion) {
        this.anio = anio;
        this.descripcion = descripcion;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);

        TextView  tvCurso = (TextView)findViewById(R.id.tv_curso);
        tvCurso.setText(this.Identificador());

        TextView aniotext2 = (TextView)findViewById(R.id.anio_text2);
        aniotext2.setText(descripcion);
    }

    public abstract String Identificador();

}
