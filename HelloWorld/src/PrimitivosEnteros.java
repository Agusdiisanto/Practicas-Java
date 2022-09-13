public class PrimitivosEnteros {
    public static void main(String[] args) {
           byte numeroByte = 7; // El byte como maximo valor soporta -127 y 127
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a  " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a  " + Byte.SIZE);
        System.out.println("valor maximo de un byte:  = " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte:  = " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a  " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a  " + Short.SIZE);
        System.out.println("valor maximo de un short:  = " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short:  = " + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a  " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a  " + Integer.SIZE);
        System.out.println("valor maximo de un int:  = " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un int:  = " + Integer.MIN_VALUE);

        var numeroVar = 127; // Var es para definir una variable flexibe, dinamica el tipo de dato se asgina
        // automatica de acuerdo al valor que asignemos al literal
    }
}
