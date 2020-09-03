package com.example.guiadelestudianteok;

public class Materia {
    private String nombre;
    private String turno;

    public Materia(String nombre, String turno) {
        this.nombre = nombre;
        this.turno = turno;
    }

    public String Datos(){
        return nombre + " : " + turno;
    }
}
