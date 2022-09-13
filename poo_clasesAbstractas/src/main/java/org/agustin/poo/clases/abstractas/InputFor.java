package org.agustin.poo.clases.abstractas;

public class InputFor extends ElementoForm{

    private String tipo = "text";

    public InputFor(String nombre) {
        super(nombre);
    }

    public InputFor(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return "<imput type= '"
                + this.tipo +
                "' name= "
                        + this.nombre +
                "' ' value= ' '" + this.valor+
                " >";
    }


}
