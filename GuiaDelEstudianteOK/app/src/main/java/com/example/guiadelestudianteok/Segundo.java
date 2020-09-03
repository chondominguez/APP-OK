package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Segundo extends CursoCicloBasico {

    public Segundo(){
        super(R.string.txt_segundo,

                new ArrayList<Materia>(){{
                    add(new Materia("materia 1","simple"));
                    add(new Materia("materia 2","contraturno"));
                }}
                );
    }
}
