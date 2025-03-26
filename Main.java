import java.util.ArrayList;
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
        ArrayList<iFigura2D> figuras = null;
        boolean listaCreada = false;

        do {
            System.out.println("\nMENÚ");
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
                    if (!listaCreada) {
                        System.out.println("\nCreando...");
                        figuras = new ArrayList<>();
                        listaCreada = true;
                        System.out.println("ArrayList creada.");
                    } else {
                        System.out.println("\nLa lista ya está creada.");
                    }
                    break;
                case 2:
                    if (listaCreada) {

                        int tipoFigura;

                        do {
                            System.out.println("\nFiguras");
                            System.out.println("1. Cuadrado");
                            System.out.println("2. Rectángulo");
                            System.out.println("3. Triángulo");
                            System.out.println("4. Círculo");
                            System.out.println("0. Salir");

                            tipoFigura = Leer.leerEntero("Introduzca su opción: ");

                            switch (tipoFigura) {
                                case 0:
                                    System.out.println("\nVolviendo al menú principal...");
                                    break;
                                case 1:
                                    Cuadrado c = new Cuadrado(
                                            Leer.leerDouble("\nIntroduzca la longitud de los lados: ")
                                    );
                                    figuras.add(c);
                                    System.out.println("Cuadrado añadido con éxito.");
                                    break;
                                case 2:
                                    Rectangulo r = new Rectangulo(
                                            Leer.leerDouble("\nIntroduzca la longitud de un lado: "),
                                            Leer.leerDouble("Introduzca la longitud de otro lado: ")
                                    );
                                    figuras.add(r);
                                    System.out.println("Rectángulo añadido con éxito.");
                                    break;
                                case 3:
                                    Triangulo t = new Triangulo(
                                            Leer.leerDouble("\nIntroduzca la base del triángulo: "),
                                            Leer.leerDouble("Introduzca la altura del triángulo: ")
                                    );
                                    figuras.add(t);
                                    System.out.println("Triángulo añadido con éxito.");
                                    break;
                                case 4:
                                    Circulo ci = new Circulo(
                                            Leer.leerDouble("\nIntroduzca el radio del Circulo: ")
                                    );
                                    figuras.add(ci);
                                    System.out.println("Círculo añadido con éxito.");
                                    break;
                                default:
                                    System.out.println("\nIntroduce un valor válido.");
                                    break;
                            }
                        }while (tipoFigura != 0);

                    } else  {
                        System.out.println("\nNo se ha podido crear, no hay ninguna ArrayList creada.");
                    }
                    break;
                case 3:
                    if (listaCreada) {
                        for (iFigura2D f : figuras) {
                            System.out.println(f);
                        }
                    } else {
                        System.out.println("\nNo se ha podido mostrar, no hay ninguna ArrayList creada.");
                    }
                    break;
                case 4:
                    if (listaCreada) {
                        double numEscalar = Leer.leerDouble("\nIntroduzca un número para escalar todas las figuras: ");

                        for (iFigura2D f : figuras) {
                            f.escalar(numEscalar);
                        }
                    } else {
                        System.out.println("\nNo se ha podido escalar, no hay ninguna ArrayList creada.");
                    }
                    break;
                case 5:
                    if (listaCreada) {
                        String opcion;
                        int iteracion = 0, index;

                        do {
                            System.out.println("\nS. Ver la lista de posiciones.");
                            System.out.println("N. No ver la lista, introducir directamente el índice.");

                            opcion = Leer.leerTexto("\nIntroduzca una opción: ").toUpperCase();

                            if (opcion.equals("S")) {
                                iteracion++;
                                for (iFigura2D f : figuras) {
                                    System.out.println(f);
                                }
                            }

                        } while (!opcion.equals("N") || iteracion == 1);

                        index = Leer.leerEntero("\nIntroduzca la posición que desea examinar: ");
                        if (index >= 0 && index < figuras.size()) {
                            System.out.println(figuras.get(index));
                        } else {
                            System.out.println("Has introducido un número que no se encuentra en la lista.");
                        }

                    } else {
                        System.out.println("\nNo se ha podido mostrar, no hay ninguna ArrayList creada.");
                    }
                    break;
                case 6:
                    if (listaCreada) {
                        String opcion;
                        int iteracion = 0, index;

                        do {
                            System.out.println("\nS. Ver la lista de posiciones.");
                            System.out.println("N. No ver la lista, introducir directamente el índice.");

                            opcion = Leer.leerTexto("\nIntroduzca una opción: ").toUpperCase();

                            if (opcion.equals("S")) {
                                iteracion++;
                                for (iFigura2D f : figuras) {
                                    System.out.println(f);
                                }
                            }
                        } while (!opcion.equals("N") || iteracion == 1);

                        index = Leer.leerEntero("\nIntroduzca un número para examinar su area: ");

                        System.out.println("Area: " + figuras.get(index).area());

                    } else {
                        System.out.println("\nNo se ha podido mostrar, no hay ninguna ArrayList creada.");
                    }
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