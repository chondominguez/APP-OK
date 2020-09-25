package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CuartoMecanica extends CursoCicloSuperior {

    public CuartoMecanica(){

        super(
                R.string.txt_cuarto,"Educación Física, Inglés, Lengua y Literatura, Matemática, " +
                        "Dibujo Mecánico I, Hidráulica Industrial, Electrotecnia, Química Aplicada, " +
                        "Tecnología de los Materiales, Mecánica Técnica, Taller",
                R.string.txt_Mecanica
        );
    }
}
