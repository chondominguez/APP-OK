package com.example.guiadelestudianteok;

public class Mecanica extends Especialidad {
    public Mecanica() {

        super(
                R.string.txt_Mecanica,
                "Título: Técnico Mecánico\n\n" +
                        "En esta especialidad se aprende a hacer planos, diseñar, evaluar, elaborar piezas y montar dispositivos mecánicos.\n\n" +
                        "Él Técnico Mecánico esta capacitado para:\n\n" +
                        "-Planificar, proyectar, calcular y dirigir proyectos de construcción de elementos y productos mecánicos.\n" +
                        "-Supervisar y/o efectuar ensayos de puestas a punto de equipamiento e instrumental pertinente, para evaluación de condiciones funcionales.\n" +
                        "-Construcción y cálculo de estructuras metálicas, aparatos de elevación, cañerías, cintas transportadoras, recipientes de almacenaje, etc.\n" +
                        "-Mantenimiento de fábricas, talleres e industrias.\n",
                R.mipmap.mecanicalogo,
                new Class[]{ TerceroMecanica.class, CuartoMecanica.class, QuintoMecanica.class, SextoMecanica.class}
        );
    }
}


