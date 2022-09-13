import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;
        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero1 = escaner.nextInt();

        System.out.println("Ingrese otro numero: ");
        int numero2 = escaner.nextInt();

        System.out.println("Ingrese otro numero: ");
        int numero3 = escaner.nextInt();

        max = (numero1 > numero2)? numero1 : numero2;
        max = (max > numero3)? max : numero3 ;

        System.out.println("El primer numero: " + numero1);
        System.out.println("El segundo numero: " + numero2);
        System.out.println("El tercer numero: " + numero3);
        System.out.println("El numero mayor es: " + max);
    }
}
