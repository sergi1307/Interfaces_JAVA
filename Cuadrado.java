public class Cuadrado implements iFigura2D {
    private double lado;

    public Cuadrado(double longitud) {
        this.lado = longitud;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public void escalar(double escala) {
        lado = lado * escala;
    }

    public String toString() {
        return "\nCuadrado: \nLado: " + this.lado + ".";
    }
}
