package com.example.guiadelestudianteok;

import java.util.List;

public abstract class CursoCicloBasico extends Curso {

    public CursoCicloBasico(int anio, String descripcion) {
        super(anio, descripcion);
    }

    @Override
    public String Identificador(){
        return getString(anio);
    }
}
