package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class QuintoMecanica extends CursoCicloSuperior {

    public QuintoMecanica(){

        super(
                R.string.txt_quinto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Dibujo Mecánico II\n" +
                        "-Mecanismos\n" +
                        "-Resistencia de Materiales\n" +
                        "-Laboratorio de Ensayo de Materiales\n" +
                        "-Termodinámica\n" +
                        "-Taller\n" +
                        "-Prácticas Profesionalizantes\n",
                R.string.txt_Mecanica
        );
    }
}
