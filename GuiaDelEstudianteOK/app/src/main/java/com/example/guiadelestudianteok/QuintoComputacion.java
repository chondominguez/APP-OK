package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class QuintoComputacion extends CursoCicloSuperior {

    public QuintoComputacion(){

        super(
                R.string.txt_quinto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Economía y Gestión de las Organizaciones\n" +
                        "-Administración y Gestión de Base de Datos\n" +
                        "-Análisis de Sistemas\n" +
                        "-Laboratorio de Programación Orientada a Objetos\n" +
                        "-Redes\n" +
                        "-Proyecto Informático II\n",
                R.string.txt_Computacion
        );
    }
}
