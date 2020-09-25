package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class QuintoComputacion extends CursoCicloSuperior {

    public QuintoComputacion(){

        super(
                R.string.txt_quinto,"Educación Física, Inglés, Lengua y Literatura, Matemática, " +
                        "Economía y Gestión de las Organizaciones, Administración y Gestión de Base de Datos, " +
                        "Análisis de Sistemas, Laboratorio de Programación Orientada a Objetos, Redes, Proyecto Informático II",
                R.string.txt_Computacion
        );
    }
}
