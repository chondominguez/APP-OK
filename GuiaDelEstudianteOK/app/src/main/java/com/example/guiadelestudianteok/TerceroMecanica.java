package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class TerceroMecanica extends CursoCicloSuperior {

    public TerceroMecanica(){

        super(
                R.string.txt_tercero,
                new ArrayList<Materia>(){{
                    add(new Materia("Materia 1","simple"));
                    add(new Materia("Materia 2", "contraturno"));
                }},
                R.string.txt_Mecanica
        );
    }
}
