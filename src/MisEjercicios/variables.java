package MisEjercicios;

public  class variables {
    public static void main(String[] args) {
        boolean valor = true;
        int numero1 = 10;
        int numero2 = 20;
        String frase = "Pasa a mayúsculas";
        var numero3 = "30"; // Variable dinámica, es una cadena de caracteres
        if (valor) {
            System.out.println(frase.toUpperCase());
            System.out.println((int) numero2);
        }
        char caracter='a';
    }
}