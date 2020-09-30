package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class SextoElectrica extends CursoCicloSuperior {

    public SextoElectrica(){

        super(
                R.string.txt_sexto,"Materias:\n\n" +
                        "-Educación Física\n" +
                        "-Ciudadanía y Trabajo, Ciencia y Tecnología\n" +
                        "-Gestión de los Procesos Productivos\n" +
                        "-Control de Máquinas Eléctricas y Accionamientos\n" +
                        "-Generación y Distribución de la Energía Eléctrica\n" +
                        "-Electrónica Aplicada\n" +
                        "-Proyecto de Instalaciones Eléctricas\n" +
                        "-Máquinas Sincrónicas y Especiales\n" +
                        "-Taller\n" +
                        "-Prácticas Profesionalizantes\n",
                R.string.txt_Electrica
        );
    }
}
