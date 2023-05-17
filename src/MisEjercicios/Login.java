package MisEjercicios;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String[] usersBD= {"pepe", "juan", "maria"};
        String[] passBD= {"123", "1234", "12345"};
        boolean logueado=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pon el usuario:");
        String user = scanner.nextLine();
        System.out.println("Pon la contraseña:");
        String password = scanner.nextLine();
        for (int i=0;i< usersBD.length;i++) {
            if (usersBD[i].equals(user) && passBD[i].equals(password)){
                logueado=true;
                break;}
            else {logueado=false; }

        }
        if (logueado){System.out.println("Logueado correctamente");}
        else {System.out.println("Error");}
        }

    }

