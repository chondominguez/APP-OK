package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CuartoQuimica extends CursoCicloSuperior {

    public CuartoQuimica(){

        super(
                R.string.txt_cuarto,
                new ArrayList<Materia>(){{
                    add(new Materia("Materia 1","Simple"));
                    add(new Materia("Materia 2","Contraturno"));
                }},
                R.string.txt_Quimica
        );
    }
}
