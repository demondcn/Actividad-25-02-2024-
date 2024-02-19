public class MatematicaCompleja {
    public static void main(String[] args) {
        //Crear numeros complejos
        Complejo num1 = new Complejo(-4,-5 );
        Complejo num2 = new Complejo(8,2 );

        Complejo sum = num1.Suma(num2);
        sum.ImprimirComplejo();

    }
}