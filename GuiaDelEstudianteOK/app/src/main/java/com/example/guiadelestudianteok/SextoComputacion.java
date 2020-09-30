package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class SextoComputacion extends CursoCicloSuperior {

    public SextoComputacion(){

        super(
                R.string.txt_sexto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Ciudadanía y Trabajo\n" +
                        "-Ciencia y Tecnología\n" +
                        "-Matemática\n" +
                        "-Gestión de los Procesos Productivos\n" +
                        "-Desarrollo de Sistemas\n" +
                        "-Programación sobre Redes\n" +
                        "-Administración de Sistemas y Redes\n" +
                        "-Prácticas Profesionalizantes\n",
                R.string.txt_Computacion
        );
    }
}
