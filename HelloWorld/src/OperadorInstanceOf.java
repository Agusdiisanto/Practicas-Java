public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String";
        // es lo mismo que poner new String("Texto a poner")

        Integer numero = 7;

        boolean b1 = texto instanceof String;

        System.out.println("Es de tipo String: " + b1);
    }
}
