package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

public class CursoCicloSuperior extends Curso {
    private int especialidad;

    public CursoCicloSuperior(int anio, String descripcion, int especialidad) {
        super(anio, descripcion);
        this.especialidad = especialidad;
    }

    @Override
    public String Identificador() {
        return getString(anio) + " " + getString(especialidad);
    }
}
