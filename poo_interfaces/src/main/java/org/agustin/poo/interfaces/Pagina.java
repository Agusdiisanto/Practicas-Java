package main.java.org.agustin.poo.interfaces;

public class Pagina extends Hoja{

    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
       return this.contenido;
    }
}
