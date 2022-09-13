public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Agustin Di Santo";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 9;
        int numeroB = 5;

        System.out.println(detalle+ " " + (numeroB + numeroA));
    }
}

