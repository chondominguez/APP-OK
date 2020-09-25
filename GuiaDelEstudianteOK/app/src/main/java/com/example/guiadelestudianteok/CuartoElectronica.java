package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CuartoElectronica extends CursoCicloSuperior {

    public CuartoElectronica(){

        super(
                R.string.txt_cuarto,"Educación Física, Inglés, Lengua y Literatura, Matemática, " +
                        "Laboratorio de Mediciones y Ensayos I, Técnicas Digitales, Circuitos Electrónicos I, " +
                        "Sistemas Electrónicos Analógicos, Taller",
                R.string.txt_Electronica
        );
    }
}
