import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        // Ejemplo simple


        //String variable = 7<5? "si es Verdadero" : "si es falso";
        //System.out.println("variable = " + variable);

        String estado;
        double promedio;
        double matematica;
        double lengua;
        double contabilidad;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemática :");
        matematica = scanner.nextDouble();

        System.out.println("Ingrese la nota de lengua :");
        lengua = scanner.nextDouble();

        System.out.println("Ingrese la nota de contabilidad :");
        contabilidad = scanner.nextDouble();

        promedio = (matematica + contabilidad + lengua) / 3;

        estado = (promedio >= 7)? "Aprobado" : "Desaprobado";
        System.out.println("Promedio del estudiante = " + estado);
    }
}
