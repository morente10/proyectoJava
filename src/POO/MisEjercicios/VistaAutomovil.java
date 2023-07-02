package POO.MisEjercicios;

import POO.MisEjercicios.Automovil;

import java.util.Arrays;

public class VistaAutomovil {
    public static void main(String[] args) {
        Automovil nissan =new Automovil();
        Automovil seat = new Automovil("Seat","leon");
        seat.prueba="borrar";
        seat.setColor("red");
        System.out.println(seat.verDetalles());

    }
}
