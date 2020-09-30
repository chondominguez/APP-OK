package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class QuintoElectrica extends CursoCicloSuperior {

    public QuintoElectrica(){

        super(
                R.string.txt_quinto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Economía y Gestión de las Organizaciones\n" +
                        "-Análisis de Circuitos Eléctricos\n" +
                        "-Sistemas Electrónicos de Potencia\n" +
                        "-Máquinas Eléctricas y Ensayos\n" +
                        "-Tecnología de la Energía\n" +
                        "-Laboratorio de Mediciones Eléctricas\n" +
                        "-Taller\n",
                R.string.txt_Electrica
        );
    }
}
