import java.util.Scanner;

public class Calculadora {
    public Scanner scanner;

    public Calculadora() {
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacion();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponente();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 6);
    }

    public void mostrarMenu() {
        System.out.println("Ricardo Medina Examen");
        System.out.println("*********************");
        System.out.println("A. Suma");
        System.out.println("B. Resta");
        System.out.println("C. Multiplicación");
        System.out.println("D. Divisíon");
        System.out.println("E. Exponente");
        System.out.println("F. Terminar");
        System.out.print("Ingrese una letra: ");
    }

    public void suma() {
        double num1, num2, resultado;
        System.out.print("Ingrese el primer Dígito: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo Dígito: ");
        num2 = scanner.nextDouble();
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public void resta() {
        double num1, num2, resultado;
        System.out.print("Ingrese el primer Dígito: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo Dígito: ");
        num2 = scanner.nextDouble();
        resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public void multiplicacion() {
        double num1, num2, resultado;
        System.out.print("Ingrese el primer Dígito: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo Dígito: ");
        num2 = scanner.nextDouble();
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public void division() {
        double num1, num2, resultado;
        System.out.print("Ingrese el primer Dígito: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo Dígito: ");
        num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }

    public void exponente() {
        double num, exponente, resultado;
        System.out.print("Ingrese el Dígito: ");
        num = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        exponente = scanner.nextDouble();
        resultado = Math.pow(num, exponente);
        System.out.println("El resultado del exponente es: " + resultado);
    }
}