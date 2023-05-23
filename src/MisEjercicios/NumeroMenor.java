package MisEjercicios;

import java.util.Scanner;

public class NumeroMenor {

    public static void main(String[] args) {
        int menor=Integer.MAX_VALUE;
        for (int i=0;i<10;i++){

            Scanner scanner= new Scanner(System.in);
            System.out.println("introduce el número "+i+":");
            int num = scanner.nextInt();
            menor = (num<menor) ? num : menor;
        }
        System.out.println("El número menor es:" + menor);
        if (menor<10) {System.out.println("El número es menor de 10");
        }else{System.out.println("El número es mayor o  de 10");}
    }
}
/*
* public class ProgramaNumeroMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a comparar: ");
        int cantidad = scanner.nextInt();

        // preguntamos si es menor a 10, ya que el mínimo según la letra de la tarea es 10 (buscar el número menor de minimo 10 valores enteros).
        if (cantidad < 10) {
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        } else {
            int menor = Integer.MAX_VALUE; // asignamos un valor máximo por defecto como numero menor para comenzar
            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if (menor < 10) {
                System.out.println("El número " + menor + " es menor que 10!");
            } else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }
    }
}
* */