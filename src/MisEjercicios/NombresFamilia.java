package MisEjercicios;

import javax.swing.*;
public class NombresFamilia {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingresa el nombre completo de la persona 1:");
        String nombre2 = JOptionPane.showInputDialog("Ingresa el nombre completo de la persona 2:");
        String nombre3 = JOptionPane.showInputDialog("Ingresa el nombre completo de la persona 3:");
        int l1=nombre1.length();
        int l2=nombre2.length();
        int l3=nombre3.length();
        String[] nombape1=nombre1.split(" ");
        String[] nombape2=nombre2.split(" ");
        String[] nombape3=nombre3.split(" ");

        if ((l1>l2) && (l1>l3)) {System.out.println(nombape1[0]+" "+nombape1[1]+ " tiene el nombre mas largo");}
        else if ((l2>l1) && (l2>l3)){System.out.println(nombape2[0]+" "+nombape2[1]+ " tiene el nombre mas largo");}
        else{System.out.println(nombape3[0]+" "+nombape3[1]+ " tiene el nombre mas largo");}

    }
}
/*
*
* import javax.swing.JOptionPane;

public class ProgramaNombreMasLargo {
    public static void main(String[] args) {
        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");

        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

        System.out.println("La persona con el nombre mas largo es " + max);
    }
}
* */