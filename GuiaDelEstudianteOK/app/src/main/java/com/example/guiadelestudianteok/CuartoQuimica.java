package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CuartoQuimica extends CursoCicloSuperior {

    public CuartoQuimica(){

        super(
                R.string.txt_cuarto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Ciudadanía y Trabajo\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Economía y Gestión de las Organizaciones\n" +
                        "-Química General\n" +
                        "-Trabajo Práctico de Química General\n" +
                        "-Química Inorgánica\n" +
                        "-Trabajo Práctico de Química Inorgánica\n" +
                        "-Física Aplicada\n" +
                        "-Trabajo Práctico de Física Aplicada\n" +
                        "-Procesos y Operaciones Químicas\n" +
                        "-Trabajo Práctico de Procesos y Operaciones Químicas\n",
                R.string.txt_Quimica
        );
    }
}
