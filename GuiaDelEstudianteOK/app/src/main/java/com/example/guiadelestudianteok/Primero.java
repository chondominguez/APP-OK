package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Primero extends CursoCicloBasico {

    public Primero(){
        super(R.string.txt_primero,
                new ArrayList<Materia>() {{
                    add(new Materia("mateia 1", "simple"));
                    add(new Materia("mateia 2", "contraturno"));
        }}
                );
    }
}

