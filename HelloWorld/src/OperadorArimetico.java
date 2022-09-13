import javax.swing.*;

public class OperadorArimetico {
    public static void main(String[] args) {

        // Divicion sin coma
        int i = 5, j=4;
        int divicion = i/j;
        System.out.println("divicion = " + divicion);

        // Divicion con coma
        float divicion1 = (float) i / j;
        System.out.println("divicion1 = " + divicion1);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero :"));
        if (numero % 2 == 0){
            System.out.println("el numero es par = " + numero);
        }
        else {
            System.out.println("el numero es impar = " + numero);
        }
    }
}
