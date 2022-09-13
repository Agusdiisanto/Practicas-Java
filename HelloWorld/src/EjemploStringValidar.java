
public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null ;
        boolean esNulo = (curso == null);
        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = "Programacion java"; // Programacion java
        } 

        boolean esVacio = curso.isEmpty();
        System.out.println("esVacio = " + esVacio);
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if (!esBlanco) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        }
    }
}

// La forma mas segura de validar es con el isBlack debido a que comprueba si esta vacio, si es null y si
// contiene espacios en blanco