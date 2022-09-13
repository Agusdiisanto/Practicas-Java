package org.agustin.pooherencia;

public class Alumno extends Persona{

    private String institucion;
    private double notaMatematica;
    private double notaLengua;
    private double notaHistoria;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematica, double notaLengua, double notaHistoria) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
        this.notaMatematica = notaMatematica;
        this.notaLengua = notaLengua;
        this.notaHistoria = notaHistoria;
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLengua() {
        return notaLengua;
    }

    public void setNotaLengua(double notaLengua) {
        this.notaLengua = notaLengua;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public double getPromedioDeNotas(){
        return ((notaMatematica+notaHistoria+notaLengua)/ 3);
    }

    public boolean getEstaPromocionado(){
        return this.getPromedioDeNotas() >= 7;
    }

    public boolean getEstaDesaprobado(){
        return this.getPromedioDeNotas() < 4;
    }


}
