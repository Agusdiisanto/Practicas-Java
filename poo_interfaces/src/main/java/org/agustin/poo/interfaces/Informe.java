package main.java.org.agustin.poo.interfaces;

public class Informe extends Hoja{

    private String autor;
    private String revisor;

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + autor + " Revisado por: " + revisor + "\n" + this.contenido;
    }

}
