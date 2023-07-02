package POO.MisEjercicios;

public class Automovil {
   private String fabricante;
   private  String modelo;
   private String color="gris";
   private double cilindrada;
   private int capacidadEstanque=40;
   String prueba;// variable para probar una variable no privada

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
   public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }
    public String verDetalles() {
        return "Fabricante:"+this.getFabricante()+"\nModelo:"+this.getModelo();
    }

    }

