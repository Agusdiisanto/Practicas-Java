public class OperadoresIncrementales {
    public static void main(String[] args) {

        // PRE INCREMENTO: Incrementa en uno y luego devuelve i

        int i = 1;

        System.out.println("Valor Inicial de i = " + i);

        int j = ++i; // i = i+1
        System.out.println("j = " + i);
        System.out.println("i = " + j);

        // POST INCREMENTO

        i = 2;

        System.out.println("Valor Inicial de i = " + i);
        System.out.println("Valor Inicial de J = " + j);

        j = i++; // Primero se le asigna a J la variable i y despues lo incrementa
        System.out.println("Valor final de i = " + i);
        System.out.println("Valor final de j = " + j);

        // PRE DECREMENTO
        i = 3;
        j = --i; // i = i-1 => 2   Decrementa en uno, luego devuelve i
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // POST DECREMENTO
        i = 4;
        j = i--; // Devuelve i, luego decrementa en uno
        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }
}
