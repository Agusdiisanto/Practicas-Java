package org.agustin.poo.clases.abstractas;

import select.Opcion;
import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm SelectForm(Opcion opcion){
        this.opciones.add(opcion);  //Para agregar un objeto a la lista
        return this;
    }



    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name= '").append(this.nombre).append(" >");

        for (Opcion opcion: this.opciones){
            sb.append("\n <option value=' ").append(opcion.getValor()).append(" ");
            if (opcion.isSelected()){
                sb.append(" selected");
            }
            sb.append(">").append(opcion.getNombre()).append("</options");
        }

        sb.append("</select>");
        return sb.toString();
    }



}
