import javax.swing.*;

public class OperadorDeAsignacion {
    public static void main(String[] args) {

        // Variables
        int i = 5;
        int j = 10;
        int x = 20;

        // Es lo mismo que i = i + 5    (Suma)
        i += 5;

        System.out.println("Resultado por suma = " + i);

        // Otro caso es para restar i = i - 5   (Resta)
        j -= 5;
        System.out.println("Resultado por resta = " + j);

        // Otro caso para la multipicacion x = x*3

        x *= 2;
        System.out.println("Resultado por la multiplicacion = " + x);
        
        // Tambien se puede concatenar los strings 
        
        String texto = "Hola";
        texto += " mi nombre es Agustin";
        System.out.println("texto = " + texto);

    }
}
