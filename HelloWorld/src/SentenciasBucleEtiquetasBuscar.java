import javax.swing.*;

public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragaron trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;

        String letraAElegir = JOptionPane.showInputDialog(null,"Ingrese una letra: ");
        char letra = letraAElegir.charAt(0);

        for (int i=0 ; i < max ; i++){
            if(frase.charAt(i) != letra){
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado "+cantidad + " veces el caracter " + letra + " en la frase");
    }
}
