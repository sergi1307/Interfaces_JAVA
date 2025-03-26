public class Rectangulo implements iFigura2D{
    private double lado1, lado2;

    public Rectangulo(double longitud1, double longitud2) {
        this.lado1 = longitud1;
        this.lado2 = longitud2;
    }

    @Override
    public double perimetro() {
        return 2 * (lado1 + lado2);
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }

    @Override
    public void escalar(double escala) {
        lado1 = lado1 * escala;
        lado2 = lado2 * escala;
    }

    public String toString() {
        return "\nRectángulo: \nLado 1: " + this.lado1 + "\nLado 2: " + this.lado2 + ".";
    }
}
