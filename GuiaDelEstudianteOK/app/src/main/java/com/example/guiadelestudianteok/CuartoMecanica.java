package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CuartoMecanica extends CursoCicloSuperior {

    public CuartoMecanica(){

        super(
                R.string.txt_cuarto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Inglés\n" +
                        "-Lengua y Literatura\n" +
                        "-Matemática\n" +
                        "-Dibujo Mecánico I\n" +
                        "-Hidráulica Industrial\n" +
                        "-Electrotecnia\n" +
                        "-Química Aplicada\n" +
                        "-Tecnología de los Materiales\n" +
                        "-Mecánica Técnica\n" +
                        "-Taller\n",
                R.string.txt_Mecanica
        );
    }
}
