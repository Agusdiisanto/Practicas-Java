import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usernames = new String[2];
        String[] passwords = new String[2];
         usernames[0] = "Agustin";
         passwords[0] = "12345";

         usernames[1]= "Jose";
         passwords[1] = "Mancedo2020";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario :");
        String u= scanner.next();

        System.out.println("Ingrese el password :");
        String p= scanner.next();

        boolean esAutenticado = false;

        for(int i=0; i< usernames.length ; i++){

           // esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;

            if (usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break; // Una vez que encuentra el usuario sale del for
            }

        }
        /*
        if (esAutenticado){
            System.out.println("Bienvenido usuario " .concat(u).concat("!"));
        }
        else{
            System.out.println("Lo siento, los datos ingresados son incorrectos");
        }
        */
        String mensaje = (esAutenticado)? "Bienvenido usuario " .concat(u).concat("!"):
                "Lo siento, los datos ingresados son incorrectos";
        System.out.println("mensaje: " + mensaje);
    }
}
