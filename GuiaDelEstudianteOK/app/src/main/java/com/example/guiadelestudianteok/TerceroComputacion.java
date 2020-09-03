package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class TerceroComputacion extends CursoCicloSuperior {
    public TerceroComputacion() {
        super(
                R.string.txt_tercero,
                new ArrayList<Materia>() {{
                    add(new Materia("mateia 1", "simple"));
                    add(new Materia("mateia 2", "contraturno"));
                }},
                R.string.txt_Computacion
        );
    }
}