package MisEjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var nombre="";
        double precio1=0;
        double precio2=0;
        double suma;
        double total;
        double impuesto;
        System.out.println("Ingrese el nombre de la factura:");
        try {
            nombre = scanner.nextLine();
        } catch (InputMismatchException e){
            System.out.println("Error debe ingresar una cadena");
            main(args);
            System.exit(0);
        }
        System.out.println("Ingrese el precio del producto 1:");
        try {
            precio1 = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Error debe ingresar un precio correcto P1");
            main(args);
            System.exit(0);
        }
        System.out.println("Ingrese el precio del producto 2");
        try {
            precio2 = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Error debe ingresar un precio correcto P2Fac");
            main(args);
            System.exit(0);
        }
        suma=(precio1+precio2);
        impuesto=(suma*0.19);
        total=impuesto+suma;
        System.out.println("La factura "+nombre+" de oficina tiene un total bruto de "+suma+",con un impuesto de"+impuesto+" y el monto después de impuesto es de "+total+".");
    }
}
