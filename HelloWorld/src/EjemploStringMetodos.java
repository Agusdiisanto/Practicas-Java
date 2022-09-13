public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Agustin";
        System.out.println("Cantidad de caracteres = " + nombre.length());
        System.out.println("nombre en mayuscula = " + nombre.toUpperCase());
        System.out.println("nombre en miniscula = " + nombre.toLowerCase());
        System.out.println("nombre es igual a Agustin = " + nombre.equals("Agustin"));
        System.out.println("nombre es igual agustin = " + nombre.equalsIgnoreCase("agustin"));
        System.out.println("nombre = " + nombre);
        System.out.println("nombre contiene la letra A = " + nombre.contains("A"));
        System.out.println("nombre comienza con la letra A = " + nombre.startsWith("A"));
        System.out.println("nombre termina con la letra n = " + nombre.endsWith("n"));
    }
}
