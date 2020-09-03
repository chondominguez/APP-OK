package com.example.guiadelestudianteok;

import java.util.List;

public abstract class CursoCicloBasico extends Curso {

    public CursoCicloBasico(int anio, List<Materia> materias) {
        super(anio, materias);
    }

    @Override
    public String Identificador(){
        return getString(anio);
    }
}
