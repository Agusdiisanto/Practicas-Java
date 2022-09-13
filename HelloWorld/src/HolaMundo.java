public class HolaMundo {
    public static void main(String[] args){
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.to = " + saludar.toUpperCase());

        int numero = 10;
        var numerox = "14";  /* Este var es de tipo dinamico, depende del valor va ser un string o un int */

        numero = 12; /* Aca la estariamos re-definiendo la variable */
        System.out.println("numero = " + numero);

    }
}
