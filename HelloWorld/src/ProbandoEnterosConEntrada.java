import javax.swing.*;

public class ProbandoEnterosConEntrada {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("El numero asignado es:" + numeroDecimal);

        String mensaje = "El numero asignado es: ";
        JOptionPane.showMessageDialog(null, mensaje + numeroDecimal);
    }
}

