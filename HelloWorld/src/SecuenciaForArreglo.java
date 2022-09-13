import javax.swing.*;

public class SecuenciaForArreglo {
    public static void main(String[] args) {
        // Para iniciar un arreglo es con []
        String[] nombres = new String[6];

        nombres[0] = "Agustin";
        nombres[1] = "Pepe";
        nombres[2] = "Ciro";
        nombres[3] = "Silvina";
        nombres[4] = "Jose";
        nombres[5] = "Matias";

        int count = nombres.length;
        String buscar = JOptionPane.showInputDialog("Ingre un nombre: ");
        boolean encontrado = false;

        // En el for se puede poner etiquetas

        etiqueta : for (String nombre:nombres){
            if (nombre.equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " a sido encontrado en el sistema!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }
    }
}