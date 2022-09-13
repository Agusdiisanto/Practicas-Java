public class ConversionDeTipos {
    public static void main(String[] args) {
        // Para convertir algo de tipo string a cualquier tipo primitivo
        /* Con el parse.... podes convertir el tipo que estaba al que queres, algunos los tienen otros no */
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        // Ahora queremos convertir un tipo primitivo a string
        // Ahora usamos el toString o en la clase String con el ValueOf
        int otroNumeroInt = 50;
        String aConvertir = Integer.toString(otroNumeroInt);
        System.out.println("Holaa Esto es : " + aConvertir);

    }
}




