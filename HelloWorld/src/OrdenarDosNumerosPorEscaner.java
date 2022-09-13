import java.util.Scanner;

public class OrdenarDosNumerosPorEscaner {

    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero1 = escaner.nextInt();

        System.out.println("Introduce otro numero a comparar: ");
        int numero2 = escaner.nextInt();

        if (numero1 > numero2){
            System.out.println("El orden de mayor a menor es: " + numero1 + "," + numero2);
        }
        else{
            System.out.println("El orden de mayor a menor es: " + numero2 + "," + numero1);
        }
    }
}
