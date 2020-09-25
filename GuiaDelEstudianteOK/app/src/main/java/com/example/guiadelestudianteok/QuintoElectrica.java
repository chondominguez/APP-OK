package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class QuintoElectrica extends CursoCicloSuperior {

    public QuintoElectrica(){

        super(
                R.string.txt_quinto,"Educación Física, Inglés, Lengua y Literatura, Matemática, Economía y Gestión de las Organizaciones, " +
                        "Análisis de Circuitos Eléctricos, Sistemas Electrónicos de Potencia, Máquinas Eléctricas y Ensayos, " +
                        "Tecnología de la Energía, Laboratorio de Mediciones Eléctricas, Taller",
                R.string.txt_Electrica
        );
    }
}
