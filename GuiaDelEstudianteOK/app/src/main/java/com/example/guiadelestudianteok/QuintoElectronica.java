package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class QuintoElectronica extends CursoCicloSuperior {

    public QuintoElectronica(){

        super(
                R.string.txt_quinto,"Educación Física, Inglés, Lengua y Literatura, Matemática, " +
                        "Sistemas de Comunicación, Programación de Dispositivos Electrónicos, Circuitos Electrónicos II, " +
                        "Sistemas Electrónicos de Potencia, Laboratorio de Mediciones y Ensayos II, Taller",
                R.string.txt_Electronica
        );
    }
}
