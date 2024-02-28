package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
    
        //
        try (Scanner escane = new Scanner(System.in)) {
           
            int opcion;
        do {
            // Menú de opciones
            System.out.print("Hola Humano, BIENVENIDO a tu calculadora de experimentos");
        
            System.out.println("Selecciona una opción dependiendo lo que te gustaria realizar:");
            System.out.println("Digite 1 para = Encontrar el promedio de 5 datos.");
            System.out.println("Digite 2 para = Resolver la ecuación de una liena en el plano cartesiano.");
            System.out.println("Digite 3 para = Realizar un ejemplo con las operaciones de residuo, multiplicacion, división, suma, resta  ");
            System.out.println("Digite 4 para = Realizar la evaluación de un polinomio de segundo grado");
            //Entrada de la opción
            opcion = escane.nextInt();
            // inicio de switch
            switch (opcion) {
                // case 1 promedio
                case 1 -> {
                    System.out.println("Vamos a sacar el promedio de 5 datos, con la siguiente formula");
                    System.out.println("FORMULA   m = (a + b + c + d + e) / 5");
                    System.out.print("Ingresa el valor de a: ");
                    double a = escane.nextDouble();
                    System.out.print("Ingresa el valor de b: ");
                    double b = escane.nextDouble();
                    System.out.print("Ingresa el valor de c: ");
                    double c = escane.nextDouble();
                    System.out.print("Ingresa el valor de d: ");
                    double d = escane.nextDouble();
                    System.out.print("Ingresa el valor de e: ");
                    double e = escane.nextDouble();
                    // aplicacion de la formula promedio
                    double m = (a + b + c + d + e) / 5;
                    // resultado a usuario
                    System.out.println("El promedio de los datos que ingresaste es: " + m);
                    }
                case 2 -> {
                    //case 2 linea en plano cartesiano
                    System.out.println("Vamos a resolver la ecuación de una liena en el plano cartesiano, con la siguiente formula");
                    System.out.println("FORMULA   y = m * x + b");
                    System.out.print("(Variable independiente) Ingresa el valor de X: ");
                    double x = escane.nextDouble();
                    System.out.print("(Variable de la pendiente) Ingrese el valor de m : ");
                    double m = escane.nextDouble();
                    System.out.print("(Punto en que la linea intersecta): Ingrese el valor de b :");
                    double b = escane.nextDouble();
                    // aplicacion de la formula 
                    double y = m * x + b;
                    // resultado a usuario
                    System.out.println("ubicación de la lienea en el plano cartesiano es: " + y);
                }
                case 3 -> {
                    //case 3 operaciones
                    System.out.println("Vamos a realizar un ejemplo con las operaciones de residuo, multiplicacion, división, suma y resta , con la siguiente formula");
                    System.out.println("FORMULA   z = a * b % c + d / e - f");
                    System.out.print("Indique el valor para a: ");
                    double a = escane.nextDouble();
                    System.out.print("Indique el valor para b: ");
                    double b = escane.nextDouble();
                    System.out.print("Indique el valor para c :");
                    double c = escane.nextDouble();
                    System.out.print("Indique el valor para d :");
                    double d = escane.nextDouble();
                    System.out.print("Indique el valor para e :");
                    double e = escane.nextDouble();
                    System.out.print("Indique el valor para f :");
                    double f = escane.nextDouble();

                    // aplicacion de la formula de operaciones
                    double z = a * b % c + d / e - f;
                    // resultado a usuario
                    System.out.println("La solucion a nuestra mezcla de operaciones es: " + z);
                }
                case 4 ->{
                    //case 4 polinomio
                    System.out.println("Vamos a resolver una ecuación de un polinomio de segundo grado , con la siguiente formula");
                    System.out.println("FORMULA   y = a * x * x + b * x + c");
                    System.out.print("Indique el valor para x: ");
                    double x = escane.nextDouble();
                    System.out.print("Indique el valor para a: ");
                    double a = escane.nextDouble();
                    System.out.print("Indique el valor para b :");
                    double b = escane.nextDouble();
                    System.out.print("Indique el valor para c :");
                    double c = escane.nextDouble();
                    
                    // aplicacion de la formula polinomio
                    double y = a * x * x + b * x + c;
                    // resultado a usuario
                    System.out.println("La solucion es: " + y);
                }
                default -> 
                    System.out.println("Opción no válida");
            }

            // Preguntar al usuario si desea continuar
            System.out.println("¿Quieres seleccionar otra opción? (1 para Sí, 0 para No): ");
            opcion = escane.nextInt();

        } while (opcion != 0);

        // Cerrar el Scanner
        escane.close();
            
            // Cerrar el objeto Scanner
        }
}
    
}
    