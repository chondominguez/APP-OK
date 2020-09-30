package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CuartoElectronica extends CursoCicloSuperior {

    public CuartoElectronica(){

        super(
                R.string.txt_cuarto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Laboratorio de Mediciones y Ensayos I\n" +
                        "-Técnicas Digitales\n" +
                        "-Circuitos Electrónicos I\n" +
                        "-Sistemas Electrónicos Analógicos\n" +
                        "-Taller\n",
                R.string.txt_Electronica
        );
    }
}
