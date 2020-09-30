package com.example.guiadelestudianteok;

public class Electrica extends Especialidad{
    public Electrica() {
        super(
            R.string.txt_Electrica,
            "Título: Técnico Electricista\n\n" +
                    "En esta especialidad se aprende a hacer planos y a realizar la instalación y mantenimiento de redes y dispositivos eléctricos.\n\n" +
                    "Él Técnico Electricista esta capacitado para:\n\n" +
                    "-Realizar la dirección, planificación y cálculos pertinentes para realizar instalaciones eléctricas domésticas, comerciales, instalaciones transformadoras, distribuidoras de energía, etc.\n" +
                    "-Chequear el cumplimiento de normas protocolares y de seguridad de dichas instalaciones.\n" +
                    "-Realizar el mantenimiento de instalaciones ya existentes.\n",
            R.mipmap.electricalogo,
                new Class[]{ TerceroElectrica.class, CuartoElectrica.class, QuintoElectrica.class, SextoElectrica.class}
        );
    }
}
