
class Program
{
    static void Main()
    {
        int opcion;

        do
        {
            // Menú de opciones
            Console.WriteLine("Hola Humano, BIENVENIDO a tu calculadora de experimentos");
            Console.WriteLine("Selecciona una opción dependiendo de lo que te gustaría realizar:");
            Console.WriteLine("1. Encontrar el promedio de 5 datos.");
            Console.WriteLine("2. Resolver la ecuación de una línea en el plano cartesiano.");
            Console.WriteLine("3. Realizar un ejemplo con las operaciones de residuo, multiplicación, división, suma, resta.");
            Console.WriteLine("4. Realizar la evaluación de un polinomio de segundo grado.");

            // Entrada de la opción
            opcion = Convert.ToInt32(Console.ReadLine());

            // Inicio del switch
            switch (opcion)
            {
                case 1:
                    // Calcula el promedio de 5 datos
                    Console.WriteLine("Vamos a sacar el promedio de 5 datos, con la siguiente fórmula:");
                    Console.WriteLine("FORMULA   m = (a + b + c + d + e) / 5");
                    Console.Write("Ingresa el valor de a: ");
                    double a = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Ingresa el valor de b: ");
                    double b = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Ingresa el valor de c: ");
                    double c = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Ingresa el valor de d: ");
                    double d = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Ingresa el valor de e: ");
                    double e = Convert.ToDouble(Console.ReadLine());
                    // Aplicación de la fórmula del promedio
                    double m = (a + b + c + d + e) / 5;
                    // Resultado al usuario
                    Console.WriteLine("El promedio de los datos que ingresaste es: " + m);
                    break;

                case 2:
                    // Resuelve la ecuación de una línea en el plano cartesiano
                    Console.WriteLine("Vamos a resolver la ecuación de una línea en el plano cartesiano, con la siguiente fórmula:");
                    Console.WriteLine("FORMULA   y = m * x + b");
                    Console.Write("(Variable independiente) Ingresa el valor de X: ");
                    double x = Convert.ToDouble(Console.ReadLine());
                    Console.Write("(Variable de la pendiente) Ingresa el valor de m: ");
                    double m_linea = Convert.ToDouble(Console.ReadLine());
                    Console.Write("(Punto en que la línea intersecta) Ingresa el valor de b: ");
                    double b_linea = Convert.ToDouble(Console.ReadLine());
                    // Aplicación de la fórmula
                    double y_linea = m_linea * x + b_linea;
                    // Resultado al usuario
                    Console.WriteLine("La ubicación de la línea en el plano cartesiano es: " + y_linea);
                    break;

                case 3:
                    // Realiza un ejemplo con operaciones de residuo, multiplicación, división, suma y resta
                    Console.WriteLine("Vamos a realizar un ejemplo con las operaciones de residuo, multiplicación, división, suma y resta, con la siguiente fórmula:");
                    Console.WriteLine("FORMULA   z = a * b % c + d / e - f");
                    Console.Write("Indica el valor para a: ");
                    double a_operaciones = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Indica el valor para b: ");
                    double b_operaciones = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Indica el valor para c: ");
                    double c_operaciones = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Indica el valor para d: ");
                    double d_operaciones = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Indica el valor para e: ");
                    double e_operaciones = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Indica el valor para f: ");
                    double f_operaciones = Convert.ToDouble(Console.ReadLine());
                    // Aplicación de la fórmula de operaciones
                    double z = a_operaciones * b_operaciones % c_operaciones + d_operaciones / e_operaciones - f_operaciones;
                    // Resultado al usuario
                    Console.WriteLine("La solución a nuestra mezcla de operaciones es: " + z);
                    break;

                case 4:
                    // Realiza la evaluación de un polinomio de segundo grado
                    Console.WriteLine("Vamos a resolver una ecuación de un polinomio de segundo grado, con la siguiente fórmula:");
                    Console.WriteLine("FORMULA   y = a * x * x + b * x + c");
                    Console.Write("Indica el valor para x: ");
                    double x_polinomio = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Indica el valor para a: ");
                    double a_polinomio = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Indica el valor para b: ");
                    double b_polinomio = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Indica el valor para c: ");
                    double c_polinomio = Convert.ToDouble(Console.ReadLine());
                    // Aplicación de la fórmula del polinomio
                    double y_polinomio = a_polinomio * x_polinomio * x_polinomio + b_polinomio * x_polinomio + c_polinomio;
                    // Resultado al usuario
                    Console.WriteLine("La solución es: " + y_polinomio);
                    break;

                default:
                    Console.WriteLine("Opción no válida");
                    break;
            }

            // Pregunta al usuario si desea continuar
            Console.WriteLine("¿Quieres seleccionar otra opción? (1 para Sí, 0 para No): ");
            opcion = Convert.ToInt32(Console.ReadLine());

        } while (opcion != 0);
    }
}