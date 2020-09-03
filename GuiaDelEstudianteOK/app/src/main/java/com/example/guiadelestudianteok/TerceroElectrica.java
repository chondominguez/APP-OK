package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class TerceroElectrica extends CursoCicloSuperior {

    public TerceroElectrica(){
        super(
                R.string.txt_tercero,
                new ArrayList<Materia>(){{
                    add(new Materia("materia 1","simple"));
                    add(new Materia("materia 2","contraturno"));
                }},
                R.string.txt_Electrica
        );
    }
}
