public class EjemploString{
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso1 = new String ("Programacion Java");

        boolean esIgual = (curso == curso1);
        System.out.println("esIgual : " + esIgual);

        esIgual = curso.equals(curso1);
        System.out.println("esIgual = " + esIgual);

        String curso2 = "programacion java";
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);
    }
}

