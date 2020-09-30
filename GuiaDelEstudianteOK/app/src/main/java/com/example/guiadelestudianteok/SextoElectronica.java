package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class SextoElectronica extends CursoCicloSuperior {

    public SextoElectronica(){

        super(
                R.string.txt_sexto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Ciudadanía y Trabajo, Ciencia y Tecnología\n" +
                        "-Gestión de los Procesos Productivos\n" +
                        "-Economía y Gestión de las Organizaciones\n" +
                        "-Redes y Sistemas de Comunicación\n" +
                        "-Sistemas Electrónicos Embebidos\n" +
                        "-Sistemas de Control de Procesos\n" +
                        "-Procesamiento Digital de Imagen y Sonido\n" +
                        "-Laboratorio de Mediciones y Ensayos III\n" +
                        "-Prácticas Profesionalizantes\n",
                R.string.txt_Electronica
        );
    }
}
