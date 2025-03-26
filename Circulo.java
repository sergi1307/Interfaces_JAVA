public class Circulo implements iFigura2D {
    private double radio;

    public Circulo(double longitud) {
        this.radio = longitud;
    }

    @Override
    public double perimetro() {
        return (2 * Math.PI) * radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void escalar(double escala) {
        radio = radio * escala;
    }

    public String toString() {
        return "\nCirculo: \nRadio: " + this.radio + ".";
    }
}
