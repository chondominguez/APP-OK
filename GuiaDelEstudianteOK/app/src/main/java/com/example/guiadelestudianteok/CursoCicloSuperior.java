package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

public class CursoCicloSuperior extends Curso {
    private int especialidad;

    public CursoCicloSuperior(int anio, List<Materia> materias, int especialidad) {
        super(anio, materias);
        this.especialidad = especialidad;
    }

    @Override
    public String Identificador() {
        return getString(anio) + " " + getString(especialidad);
    }
}
