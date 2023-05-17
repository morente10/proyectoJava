package MisEjercicios;

import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        double media5=0;
        int num5=0;
        double media4=0;
        int num4=0;
        int unos=0;
        double mediatotal=0;
        for (int i=0;i<20;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("introduce la nota " + i + ":");
            double num = scanner.nextDouble();
            if (num >=0 && num <= 7) {
                if (num > 5) {
                    media5 += num;
                    num5++;
                } else if (num < 4) {
                    media4 += num;
                    num4++;
                } else if (num == 0) {
                    break;}

                unos = (num == 1) ? unos + 1 : unos;
                mediatotal = mediatotal + num;
            }else{System.out.println("Nota incorrecta");}
        }
        System.out.println("La nota media mayores 5:"+media5/num5+":");
        System.out.println("La nota media menores 4:"+media4/num4+":");
        System.out.println("Número de unos: "+unos);
        System.out.println("La nota media total "+mediatotal/20+":");
    }}
/*public class PromedioNotasAlumnos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota; // la nota a ingresar
        int contNotas1 = 0; // el contador de notas 1
        int contNotasMayoresA5 = 0; // contador de notas mayores a 5
        int contNotasMenoresA4 = 0; // contador de notas menores a 4
        double sumaNotasMayoresA5 = 0; // suma de notas mayores a 5
        double sumaNotasMenoresA4 = 0; // suma de notas menores a 4
        double sumaTotal = 0; // suma total de notas

        double promedioNotasMayoresA5, promedioNotasMenoresA4; // los promedios de notas mayores a 5 y menores a 4

        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce una nota (entre 1 y 7) N" + (i + 1) + ": ");
            nota = scanner.nextDouble();

            if (nota == 0) {
                error = true;
                break;
            }

            if (nota == 1) {
                contNotas1++;
            } else {
                if (nota > 5) {
                    contNotasMayoresA5++;
                    sumaNotasMayoresA5 += nota;
                } else if (nota < 4) {
                    contNotasMenoresA4++;
                    sumaNotasMenoresA4 += nota;
                }
            }
            sumaTotal += nota;
        }
        if (error) {
            System.err.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecución del programa.");
            System.exit(1);
        }
        // mostramos la cantidad de notas 1
        System.out.println("El número de notas 1 es de: " + contNotas1);
        //trabajamos con las notas superiores a 5
        if (contNotasMayoresA5 == 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promedioNotasMayoresA5 = sumaNotasMayoresA5 / contNotasMayoresA5;
            System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
        }

        // trabajamos con las notas inferiores a 4
        if (contNotasMenoresA4 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4;
            System.out.println("Promedio de notas menores a 3: " + promedioNotasMenoresA4);
        }

        // promedio total de las notas
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
    }
}*/