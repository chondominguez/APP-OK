package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CuartoConstrucciones extends CursoCicloSuperior {

    public CuartoConstrucciones(){

        super(
                R.string.txt_cuarto, "Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Ciudadanía y Trabajo\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Química Aplicada\n" +
                        "-Teoría de la Arquitectura I y Representación Gráfica\n" +
                        "-Práctica Proyectual Integradora I\n" +
                        "-Taller de Técnicas\n" +
                        "-Sistemas Constructivos e Instalaciones II\n" +
                        "-Tecnología de los Materiales\n" +
                        "-Estática\n" +
                        "-Resistencia de los Materiales\n",
                R.string.txt_Construcciones
        );
    }
}
