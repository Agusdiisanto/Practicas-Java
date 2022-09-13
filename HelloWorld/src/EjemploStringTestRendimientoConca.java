public class EjemploStringTestRendimientoConca {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();
        
        for(int i = 0; i < 500; i++){
             // c = c.concat(a).concat(b).concat("\n");  // 2 ms
             // c +=a+b;      // 13 ms
            sb.append(a).append(b);
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("c = " + sb.toString());  // StringBuilder es el mas eficiente para concatenar strings
    }
}
