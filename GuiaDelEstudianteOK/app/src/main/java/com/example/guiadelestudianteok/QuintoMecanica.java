package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class QuintoMecanica extends CursoCicloSuperior {

    public QuintoMecanica(){

        super(
                R.string.txt_quinto,"Educación Física, Inglés, Lengua y Literatura, Matemática, " +
                        "Dibujo Mecánico II, Mecanismos, Resistencia de Materiales, Laboratorio de Ensayo de Materiales, " +
                        "Termodinámica, Taller, Prácticas Profesionalizantes",
                R.string.txt_Mecanica
        );
    }
}
