package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CuartoComputacion extends CursoCicloSuperior {

    public CuartoComputacion(){

        super(
                R.string.txt_cuarto, "Materias:\n\n" +
                        "-Historia\n" +
                        "-Geografía\n" +
                        "-Educación Física\n" +
                        "-Educación Ciudadana\n" +
                        "-Inglés\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Física\n" +
                        "-Tecnología de la Representación\n" +
                        "-Química\n" +
                        "-Taller de Tecnología del Control\n" +
                        "-Taller (Diseño Multimedia, Programación)\n",
                R.string.txt_Computacion
        );
    }
}
