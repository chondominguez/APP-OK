package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class TerceroElectronica extends CursoCicloSuperior {

    public TerceroElectronica(){

        super(
                R.string.txt_tercero, "Historia, Geografía, Educación Física, Educación Física, Inglés, " +
                        "Lengua y Literatura, Matemática, Física, Tecnología de la Representación, Química, " +
                        "Taller de Tecnología del Control, Taller",
                R.string.txt_Electronica
        );
    }
}
