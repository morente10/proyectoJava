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
            char[] nombreArray = nombre.toCharArray();
            char[] nombreArray2 = nombre2.toCharArray();
            char[] nombreArray3 = nombre3.toCharArray();
            System.out.println(nombreArray[1].+ "."+nombreArray[l1-2]+nombreArray[l1-1]+"_"+nombreArray2[1]+"."+nombreArray2[l2-2]+nombreArray2[l2-1]+"_"+nombreArray3[1]+"."+nombreArray3[l3-2]+nombreArray3[l3-1]);


        }
    }


    }

