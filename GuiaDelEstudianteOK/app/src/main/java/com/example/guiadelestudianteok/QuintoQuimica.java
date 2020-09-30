package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class QuintoQuimica extends CursoCicloSuperior {

    public QuintoQuimica(){

        super(
                R.string.txt_quinto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Gestión de los Procesos Productivos\n" +
                        "-Laboratorio de Instrumental y Certificación de Normas\n" +
                        "-Química Analítica Cualitativa\n" +
                        "-Trabajo Práctico de Química Analítica Cualitativa\n" +
                        "-Química Orgánica I\n" +
                        "-Trabajo Práctico de Química Orgánica\n" +
                        "-Química Industrial I\n" +
                        "-Trabajo Práctico de Química Industrial I\n",
                R.string.txt_Quimica
        );
    }
}
