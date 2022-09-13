package test.java.org.agustin.poo.interfaces;
import main.java.org.agustin.poo.interfaces.*;
import static main.java.org.agustin.poo.interfaces.Genero.*;


public class Ejemplo {
    public static void main(String[] args) {


        Curriculum cv = new Curriculum("Resumen Laboral...", "Agustin Di Santo", "Tecnicatura En Programacion");
        cv.addExperiencia("Java");
        cv.addExperiencia("UML");

        Libro libro = new Libro("Erich Gamma", "Patrones de diseño: Elem.Reusables",PROGRAMACION);
        libro.addPaginas(new Pagina("Patron Singleton")).addPaginas(new Pagina("Patron Observador"))
                .addPaginas(new Pagina("Patron Factory"))


       Informe informe = new Informe("Estudio sobre microservicios", "Martin Fowler", "James");
        imprimir(cv);
        imprimir(informe);
    }


    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }



}
