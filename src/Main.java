//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int opcion;

                do {
                    System.out.println("Seleccione una alternativa:");
                    System.out.println("1. Metros a Kilómetros");
                    System.out.println("2. Centímetros a Metros");
                    System.out.println("3. Pies a Metros");
                    System.out.println("4. Salir");
                    System.out.print("Ingrese una conversion: ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese la cantidad en metros: ");
                            double metros = scanner.nextDouble();
                            double kilometros = metrosAKilometros(metros);
                            System.out.println(metros + " metros son " + kilometros + " kilómetros.");
                            break;
                        case 2:
                            System.out.print("Ingrese la cantidad en centímetros: ");
                            double centimetros = scanner.nextDouble();
                            double metrosDesdeCm = centimetrosAMetros(centimetros);
                            System.out.println(centimetros + " centímetros son " + metrosDesdeCm + " metros.");
                            break;
                        case 3:
                            System.out.print("Ingrese la cantidad en pies: ");
                            double pies = scanner.nextDouble();
                            double metrosDesdePies = piesAMetros(pies);
                            System.out.println(pies + " pies son " + metrosDesdePies + " metros.");
                            break;
                        case 4:
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                    System.out.println();
                } while (opcion != 4);

                scanner.close();
            }

            public static double metrosAKilometros(double metros) {
                return metros / 1000;
            }

            public static double centimetrosAMetros(double centimetros) {
                return centimetros / 100;
            }

            public static double piesAMetros(double pies) {
                return pies * 0.3048;
            }
        }
