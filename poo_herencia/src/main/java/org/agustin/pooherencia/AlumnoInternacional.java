package org.agustin.pooherencia;

public class AlumnoInternacional extends Alumno{

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais = pais;
    }

    private String pais;
    private double notaIdiomas;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public double getPromedioDeNotas() {
        return ((super.getPromedioDeNotas()*3)+notaIdiomas)/4; //Llamo al mismo mensaje que el alumno salvo que modifico una pequeña parte
    }

    @Override
    public boolean getEstaPromocionado() {          //Aca modifico todo el mensaje
        return (this.getPromedioDeNotas() > 7);
    }

    @Override
    public boolean getEstaDesaprobado() {
        return (this.getPromedioDeNotas() <= 7);
    }
}
