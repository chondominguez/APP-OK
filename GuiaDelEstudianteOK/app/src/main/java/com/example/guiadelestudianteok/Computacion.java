package com.example.guiadelestudianteok;

public class Computacion extends Especialidad {
    public Computacion() {
        super(
                R.string.txt_Computacion,
                "Título: Técnico en Computación\n\n" +
                        "En esta especialidad se aprende a manejar computadoras, " +
                        "tanto su parte física como su parte lógica, como los programas, " +
                        "aplicaciones, etc, y se aprende a manejar datos y a programar.\n\n" +
                        "Él Técnico en Computación esta capacitado para:\n\n" +
                        "-Crear aplicaciones y darles mantenimiento y actualizaciones.\n" +
                        "-Instalar y configurar sistemas operativos.\n" +
                        "-Brindar soporte a los usuarios de cualquier sistema.\n" +
                        "-Asesorar con respecto a compra de dispositivos.\n" +
                        "-Poder trabajar para alguien, en sociedad o por cuenta propia.\n",
                R.mipmap.computacionlogo,
                new Class[]{ TerceroComputacion.class, CuartoComputacion.class, QuintoComputacion.class, SextoComputacion.class }
        );
    }
}