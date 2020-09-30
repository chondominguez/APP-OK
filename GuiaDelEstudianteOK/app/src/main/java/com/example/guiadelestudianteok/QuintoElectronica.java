package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class QuintoElectronica extends CursoCicloSuperior {

    public QuintoElectronica(){

        super(
                R.string.txt_quinto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Sistemas de Comunicación\n" +
                        "-Programación de Dispositivos Electrónicos\n" +
                        "-Circuitos Electrónicos II\n" +
                        "-Sistemas Electrónicos de Potencia\n" +
                        "-Laboratorio de Mediciones y Ensayos II\n" +
                        "-Taller\n",
                R.string.txt_Electronica
        );
    }
}
