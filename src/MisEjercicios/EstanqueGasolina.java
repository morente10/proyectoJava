package MisEjercicios;
import java.util.Scanner;
public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la medida actual en litros: ");
        double medidaActual = scanner.nextDouble();

        String resultado = (medidaActual == 70) ? "Estanque lleno"
                : (medidaActual >= 60 && medidaActual < 70) ? "Estanque casi lleno"
                : (medidaActual >= 40 && medidaActual < 60) ? "Estanque 3/4"
                : (medidaActual >= 35 && medidaActual < 40) ? "Medio Estanque"
                : (medidaActual >= 20 && medidaActual < 35) ? "Suficiente"
                : (medidaActual >= 1 && medidaActual < 20) ? "Insuficiente"
                : "Medida inválida";

        System.out.println(resultado);
        /*
        * System.out.println("Introduzca la capacidad actual del estanque (máx 70 litros): ");
        double capacidadActual = scanner.nextDouble();

        if (capacidadActual >= 0 && capacidadActual < 20) {
            System.out.println("Insuficiente");
        } else if (capacidadActual >= 20 && capacidadActual < 35) {
            System.out.println("Suficiente");
        } else if (capacidadActual >= 35 && capacidadActual < 40) {
            System.out.println("Medio Estanque");
        } else if (capacidadActual >= 40 && capacidadActual < 60) {
            System.out.println("Estanque  3/4");
        } else if (capacidadActual >= 60 && capacidadActual < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidadActual == 70) {
            System.out.println("Estanque lleno");
        }
        *
        *
        *
        *
        * */
    }}
