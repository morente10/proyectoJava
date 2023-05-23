package MisEjercicios;

import java.util.Scanner;

public class MultiplicarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = scanner.nextInt();
        int mult=0;
        System.out.println("Introduce otro numero:");
        int num2 = scanner.nextInt();
        boolean positivo=false;
        if ((num>=0 && num2>=0) || (num<0 && num2<0) ){positivo=true;}
            num=Math.abs(num);
         num2=Math.abs(num2);

        for (int i=0;i<num2;i++){mult+=num;}
        if (positivo){System.out.println("El resultado de la multiplicación es:"+mult);}
        else{
            mult=mult*(-1);
            System.out.println("El resultado de la multiplicación es:"+mult);}
    }
}
