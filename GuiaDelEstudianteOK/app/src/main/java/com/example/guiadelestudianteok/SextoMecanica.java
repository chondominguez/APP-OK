package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class SextoMecanica extends CursoCicloSuperior {

    public SextoMecanica(){

        super(
                R.string.txt_sexto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Ciudadanía y Trabajo, Ciencia y Tecnología\n" +
                        "-Gestión de los Procesos Productivos\n" +
                        "-Economía y Gestión de las Organizaciones\n" +
                        "-Sistemas de Elevación y Transporte\n" +
                        "-Instalaciones Industriales y Mantenimiento\n" +
                        "-Instalaciones Termomecánicas\n" +
                        "-Instrumentación y Ensayo de Máquinas y Motores\n" +
                        "-Proyecto Mecánico\n" +
                        "-Tecnología de Fabricación\n" +
                        "-Seguridad e Higiene Industrial y Medio Ambiente\n" +
                        "-Taller\n" +
                        "-Prácticas Profesionalizantes\n",
                R.string.txt_Mecanica
        );
    }
}
