package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CuartoQuimica extends CursoCicloSuperior {

    public CuartoQuimica(){

        super(
                R.string.txt_cuarto,"Educación Física, Inglés, Ciudadanía y Trabajo, Lengua y Literatura, Matemática, " +
                        "Economía y Gestión de las Organizaciones, Química General, Trabajo Práctico de Química General, " +
                        "Química Inorgánica, Trabajo Práctico de Química Inorgánica, Física Aplicada, Trabajo Práctico de Física Aplicada, " +
                        "Procesos y Operaciones Químicas, Trabajo Práctico de Procesos y Operaciones Químicas.",
                R.string.txt_Quimica
        );
    }
}
