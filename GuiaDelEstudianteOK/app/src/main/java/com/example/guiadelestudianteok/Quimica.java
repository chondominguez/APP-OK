package com.example.guiadelestudianteok;

public class Quimica extends Especialidad {
    public Quimica() {
        super(
                R.string.txt_Quimica,
                "Título: Técnico Químico\n\n" +
                        "En esta especialidad se aprenden las propiedades de los elementos, sus combinaciones, sus efectos y cómo tratarlos y elaborar las mezclas.\n\n" +
                        "Él Técnico Químico esta capacitado para:\n\n" +
                        "-Supervisar y realizar ensayos en el ámbito industrial.\n" +
                        "-Dirigir, realizar y asesorar respecto de la fabricación y utilización de productos o procesos químicos industriales.\n" +
                        "-Efectuar limpieza e inventario de un laboratorio.\n" +
                        "-Realizar análisis químicos, físicos, etc.\n" +
                        "-Operar y administrar laboratorios.\n" +
                        "-Realizar muestreos.\n" +
                        "-Operar equipo pertinente.\n",
                R.mipmap.quimicalogo,
                new Class[]{TerceroQuimica.class, CuartoQuimica.class, QuintoQuimica.class, SextoQuimica.class}
        );
    }
}
