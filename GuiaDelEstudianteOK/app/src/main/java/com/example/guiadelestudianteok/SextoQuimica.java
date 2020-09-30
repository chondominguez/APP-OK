package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class SextoQuimica extends CursoCicloSuperior {

    public SextoQuimica(){

        super(
                R.string.txt_sexto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Ciencia y Tecnología\n" +
                        "-Química Cuantitativa e Instrumental\n" +
                        "-Trabajo Práctico de Química Cuantitativa e Instrumental\n" +
                        "-Química Orgánica y Bio-Orgánica\n" +
                        "-Trabajo Práctico de Química Orgánica y Bio-Orgánica\n" +
                        "-Química Industrial II\n" +
                        "-Trabajo Práctico de Química Industrial II\n" +
                        "-Tecnología de los Alimentos y Bio Tecnología\n" +
                        "-Trabajo Práctico de Tecnología de los Alimentos y Bio Tecnología\n" +
                        "-Prácticas Profesionalizantes\n",
                R.string.txt_Quimica
        );
    }
}
