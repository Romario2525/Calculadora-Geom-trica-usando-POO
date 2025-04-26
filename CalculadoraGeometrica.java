import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> resultados = new ArrayList<>();
        boolean continuar = true;

        System.out.println("Bienvenido a la Calculadora Geométrica POO");
        System.out.println("------------------------------------------");

        while (continuar) {
            try {
                System.out.println("\nSeleccione una operación:");
                System.out.println("1. Área o Perímetro de Figuras");
                System.out.println("2. Cálculo de Potencia");
                System.out.print("Opción: ");
                int opcionPrincipal = scanner.nextInt();

                if (opcionPrincipal == 1) {
                    manejarFiguras(scanner, resultados);
                } else if (opcionPrincipal == 2) {
                    manejarPotencia(scanner, resultados);
                } else {
                    System.out.println("Opción inválida.");
                    continue;
                }

                System.out.print("\n¿Desea realizar otra operación? (s/n): ");
                char respuesta = scanner.next().toLowerCase().charAt(0);
                if (respuesta != 's') {
                    continuar = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida.");
                scanner.nextLine();
            }
        }

        System.out.println("\nResultados de las operaciones realizadas:");
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println((i + 1) + ". " + resultados.get(i));
        }

        scanner.close();
        System.out.println("\n¡Gracias por usar la calculadora!");
    }

    private static void manejarFiguras(Scanner scanner, ArrayList<Double> resultados) {
        System.out.println("\nSeleccione una figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        System.out.print("Opción: ");
        int opcionFigura = scanner.nextInt();

        System.out.println("\nSeleccione operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        System.out.print("Opción: ");
        int opcionOperacion = scanner.nextInt();
        boolean esArea = (opcionOperacion == 1);

        Operacion operacion = null;

        switch (opcionFigura) {
            case 1:
                System.out.print("\nIngrese el radio: ");
                double radio = scanner.nextDouble();
                operacion = new Circulo(radio, esArea);
                break;
            case 2:
                System.out.print("\nIngrese el lado: ");
                double lado = scanner.nextDouble();
                operacion = new Cuadrado(lado, esArea);
                break;
            case 3:
                if (esArea) {
                    System.out.print("\nIngrese la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double altura = scanner.nextDouble();
                    operacion = new Triangulo(base, altura);
                } else {
                    System.out.print("\nIngrese los tres lados separados por espacio: ");
                    double lado1 = scanner.nextDouble();
                    double lado2 = scanner.nextDouble();
                    double lado3 = scanner.nextDouble();
                    operacion = new Triangulo(lado1, lado2, lado3);
                }
                break;
            case 4:
                System.out.print("\nIngrese la base: ");
                double baseR = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double alturaR = scanner.nextDouble();
                operacion = new Rectangulo(baseR, alturaR, esArea);
                break;
            case 5:
                if (esArea) {
                    System.out.print("\nIngrese la longitud de un lado: ");
                    double ladoP = scanner.nextDouble();
                    System.out.print("Ingrese el apotema: ");
                    double apotema = scanner.nextDouble();
                    operacion = new Pentagono(ladoP, apotema, true);
                } else {
                    System.out.print("\nIngrese la longitud de un lado: ");
                    double ladoP = scanner.nextDouble();
                    operacion = new Pentagono(ladoP, 0, false);
                }
                break;
            default:
                System.out.println("Figura inválida.");
                return;
        }

        double resultado = operacion.calcular();
        System.out.println("Resultado: " + resultado);
        resultados.add(resultado);
    }

    private static void manejarPotencia(Scanner scanner, ArrayList<Double> resultados) {
        System.out.print("\nIngrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        if (exponente < 0) {
            System.out.println("El exponente debe ser positivo.");
            return;
        }

        Operacion operacion = new Potencia(base, exponente);
        double resultado = operacion.calcular();
        System.out.println("Resultado: " + resultado);
        resultados.add(resultado);
    }
}