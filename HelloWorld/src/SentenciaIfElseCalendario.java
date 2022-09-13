import javax.swing.*;

public class SentenciaIfElseCalendario {
    public static void main(String[] args) {

        int dia = 0;
        String mesAElegir = JOptionPane.showInputDialog(null,"Ingrese un numero del mes: ");
        int mes = Integer.parseInt(mesAElegir);
        String yearAElegir = JOptionPane.showInputDialog(null, "Ingrese el año: ");
        int year = Integer.parseInt(yearAElegir);

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            dia = 31;
        } else if ( mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dia = 30;
        } else if (mes == 2) {
            if ((year % 400==0) || ((year % 4 == 0) && !(year % 100 == 0))){
                dia = 29;
            }else{
                dia = 28;
            }
        }
        String mensaje = "Los dias que tiene ese mes son: ";
        JOptionPane.showMessageDialog(null, mensaje + dia);
    }
}
