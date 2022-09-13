package main.java.org.agustin.poo.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja{

    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String experiencias){
        this.experiencias.add(experiencias);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n").append("Resumen: ").append(this.contenido).append("\n")
                .append("Profesion: ").append(this.carrera).append("\n").append("Experencias: \n");
        for (String experencia:this.experiencias) {
            sb.append("- ").append(experencia).append("\n");
            
        }
        return sb.toString();
    }
}
