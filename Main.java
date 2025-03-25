public class Main {
    public static void pruebaEstadistica() {
        ArrayListDoubleEstadistica lista = new ArrayListDoubleEstadistica();
        ArrayDoubleEstadistica array = new ArrayDoubleEstadistica(5);

        double[] valores = {3.5, 8.9, 26.1, 0.9, 6.7};

        for (double v : valores) {
            lista.agregar(v);
            array.agregar(v);
        }

        System.out.println("Estadísticas con ArrayList:");
        mostrarEstadisticas(lista);

        System.out.println("\nEstadísticas con Array:");
        mostrarEstadisticas(array);


    }

    public static void programaFiguras() {
        int opc;

        do {

            System.out.println("1. Crea un ArrayList figuras.");
            System.out.println("2. Añadir figuras de diferentes tipos.");
            System.out.println("3. Mostrar la información de todas las figuras del ArrayList.");
            System.out.println("4. Escalar todas las figuras según un valor introducido.");
            System.out.println("5. Mostrar la información de una figura seleccionada.");
            System.out.println("6. Mostrar el área de una figura seleccionada.");
            System.out.println("7. Mostrar el perímetro de una figura seleccionada.");
            System.out.println("0. Salir");

            opc = Leer.leerEntero("\nIntroduzca una opción: ");

            switch (opc) {
                case 0:
                    System.out.println("\nSaliendo del programa...");
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("\nIntroduzca un valor válido.");
                    break;
            };

        } while (opc != 0);
    }

    public static void mostrarEstadisticas(Estadisticas obj) {
        System.out.println("Mínimo: " + obj.minimo());
        System.out.println("Máximo: " + obj.maximo());
        System.out.println("Media: " + obj.media());
        System.out.println("Suma: " + obj.suma());
        System.out.println("Resta: " + obj.resta());
        System.out.println("Cuantos: " + obj.cuantos());
    }

    public static void main(String[] args) {
        String opc;

        do {
            System.out.println("E - Estadística.");
            System.out.println("F - Figura.");
            System.out.println("S - Salir.");

            opc = Leer.leerTexto("Introduzca su opción: ").toUpperCase();

            if (opc.equals("E")) {
                pruebaEstadistica();
            } else {
                programaFiguras();
            }

        } while (!opc.equals("S"));
    }
}