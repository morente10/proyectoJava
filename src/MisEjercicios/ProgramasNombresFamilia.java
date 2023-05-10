package MisEjercicios;

import java.util.Scanner;

public class ProgramasNombresFamilia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pon el nombre del primer familiar:");
        String nombre = scanner.nextLine();
        System.out.println("Pon el nombre del segundo familiar:");
        String nombre2 = scanner.nextLine();
        System.out.println("Pon el nombre del tercer familiar:");
        String nombre3 = scanner.nextLine();
        int l1=nombre.length();
        int l2=nombre2.length();
        int l3=nombre3.length();
        if (nombre.isBlank() || l1 <= 3 || nombre2.isBlank() || nombre3.isBlank() || l3 <= 3){
            System.out.println("Los nombres son incorrectos");

        }else{
            String newNombre1=nombre.charAt(1)+"."+nombre.substring(l1-2);
            String newNombre2=nombre2.charAt(1)+"."+nombre2.substring(l2-2);
            String newNombre3=nombre2.charAt(1)+"."+nombre3.substring(l3-2);
            String resultado= newNombre1.concat("_").concat(newNombre2).concat("_").concat(newNombre3);
            //metodo concatenación más eficiente
            String resultado2=
            System.out.println(resultado);
            System.out.println(resultado2);
        }
    }


    }

