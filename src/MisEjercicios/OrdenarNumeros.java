package MisEjercicios;

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Pon un número");
        int num1 = scanner.nextInt();
        System.out.println("Pon otro número:");
        int num2 = scanner.nextInt();
        int menor = (num1 < num2) ? num1 : num2;
        int mayor = (num1 > num2) ? num1 : num2;
        // String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;
        System.out.println(menor+" es menor a" +mayor);
}
}