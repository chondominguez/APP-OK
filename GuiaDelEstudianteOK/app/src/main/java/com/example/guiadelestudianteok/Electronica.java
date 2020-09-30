package com.example.guiadelestudianteok;

public class Electronica extends Especialidad {
    public Electronica() {

        super(
                R.string.txt_Electronica,
                "Título: Técnico en Electrónica\n\n" +
                        "En esta especialidad se aprende a manejar, diseñar, construir y mantener dispositivos e instalaciones electrónicos.\n\n" +
                        "Él Técnico en Electrónica esta capacitado para:\n\n" +
                        "-Diseñar, desarrollar y realizar mantenimiento de componentes y equipos de electrónica analógica y digital a nivel industrial o no.\n" +
                        "-Montar e instalar componentes y equipos electrónicos.\n",
                R.mipmap.electronicalogo,
                new Class[]{ TerceroElectronica.class, CuartoElectronica.class, QuintoElectronica.class, SextoElectronica.class}
        );
    }
}
