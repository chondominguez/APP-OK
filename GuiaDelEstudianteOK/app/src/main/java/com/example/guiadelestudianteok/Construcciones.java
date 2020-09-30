package com.example.guiadelestudianteok;

public class Construcciones extends Especialidad {
    public Construcciones() {

        super(
                R.string.txt_Construcciones,
                "Título: Maestro Mayor de Obras (MMO)\n\n" +
                        "En esta especialidad se aprende a realizar planos y planificaciones, así como las construcciones de edificaciones propiamente dichas.\n\n" +
                        "Él Maestro Mayor de Obras esta capacitado para:\n" +
                        "-Dirigir, planificar, tasar y realizar la construcción de edificios para uso como vivienda.\n" +
                        "-Comprobar cumplimiento de normas protocolares y de seguridad de edificaciones o instalaciones.\n" +
                        "-Dirigir, planificar y realizar la instalación de servicios tales como gas, agua, obras sanitarias, etc.\n",
                R.mipmap.construccioneslogo,
                new Class[]{ TerceroConstrucciones.class, CuartoConstrucciones.class, QuintoConstrucciones.class, SextoConstrucciones.class }
        );
    }
}


