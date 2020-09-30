package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class TerceroElectrica extends CursoCicloSuperior {

    public TerceroElectrica(){
        super(
                R.string.txt_tercero,"Materias:\n\n" +
                        "-Historia\n" +
                        "-Geografía\n" +
                        "-Educación Física\n" +
                        "-Educación Ciudadana\n" +
                        "-Inglés\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Física\n" +
                        "-Tecnología de la Representación\n" +
                        "-Química\n" +
                        "-Taller de Tecnología del Control\n" +
                        "-Taller\n",
                R.string.txt_Electrica
        );
    }
}
