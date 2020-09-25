package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class TerceroQuimica extends CursoCicloSuperior {

    public TerceroQuimica(){

        super(
                R.string.txt_tercero,"Historia, Geografía, Educación Física, Educación Ciudadana, Inglés, " +
                        "Lengua y Literatura, Matemática, Física, Tecnología de la Representación, Química, " +
                        "Taller de Tecnología y del Control, Taller",
                R.string.txt_Quimica
        );
    }
}
