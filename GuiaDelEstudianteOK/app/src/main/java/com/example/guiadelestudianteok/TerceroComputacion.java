package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class TerceroComputacion extends CursoCicloSuperior {
    public TerceroComputacion() {
        super(
                R.string.txt_tercero,"Materias:\n\n" +
                        "-Historia\n" +
                        "-Geografía\n" +
                        "-Educación Física\n" +
                        "-Educación Ciudanana\n" +
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