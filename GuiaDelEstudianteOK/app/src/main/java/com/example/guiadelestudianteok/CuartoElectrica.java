package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CuartoElectrica extends CursoCicloSuperior {

    public CuartoElectrica(){

        super(
                R.string.txt_cuarto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Circuitos Eléctricos y Mediciones\n" +
                        "-Circuitos Electromagnéticos y Ensayos\n" +
                        "-Electrónica\n" +
                        "-Técnicas de Laboratorio\n" +
                        "-Mecánica Aplicada a los Mecanismos\n" +
                        "-Taller\n",
                R.string.txt_Electrica
        );
    }
}
