using System;

public class MatematicaCompleja
{
    public static void Main(string[] args)
    {
        string Hola = Microsoft.VisualBasic.Interaction.InputBox("Por favor, introduce tu nombre:");

        int opccion = int.Parse(Microsoft.VisualBasic.Interaction.InputBox("Por favor, introduce una opcion de las siguientes:" +
            "\n 1.Suma" +
            "\n 2.Resta" +
            "\n 3.Multiplicacion" +
            "\n "));
        double real1 = double.Parse(Microsoft.VisualBasic.Interaction.InputBox("de su numero complejo que numero es la parte real"));
        double img1 = double.Parse(Microsoft.VisualBasic.Interaction.InputBox("de su numero complejo que numero es la parte imaginaria"));
        double real2 = double.Parse(Microsoft.VisualBasic.Interaction.InputBox("de su segundo numero complejo que numero es la parte real"));
        double img2 = double.Parse(Microsoft.VisualBasic.Interaction.InputBox("de su segundo numero complejo que numero es la parte imaginaria"));
        Complejo num1 = new Complejo(real1, img1);
        Complejo num2 = new Complejo(real2, img2);

        switch (opccion)
        {
        case 1:
            Complejo sum = num1.Suma(num2);
            sum.ImprimirComplejo();
            break;
        case 2:
            Complejo res = num1.Resta(num2);
            res.ImprimirComplejo();
            break;
        case 3:
            Complejo multi = num1.Multiplicacion(num2);
            multi.ImprimirComplejo();
            break;
        }
    }
}
public class Complejo
{
    private double real;
    private double imaginary;

    //constructor
    public Complejo(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    //metodos del objeto para realizar las respectivas Operaciones aritmeticas

    //Suma de numeros Complejos
    public Complejo Suma(Complejo num)
    {
        double realPart = this.real + num.real;
        double imaginaryPart = this.imaginary + num.imaginary;
        return new Complejo(realPart, imaginaryPart);
    }
    //Resta de numeros Complejos
    public Complejo Resta(Complejo num)
    {
        double realPart = this.real - num.real;
        double imaginaryPart = this.imaginary - num.imaginary;
        return new Complejo(realPart, imaginaryPart);
    }
    public Complejo Multiplicacion(Complejo num)
    {
        double realPart = this.real * num.real;
        double imaginaryPart1 = this.real * num.imaginary;
        double imaginaryPart2 = this.imaginary * num.real;
        double imaginaryPart3 = this.imaginary * num.imaginary;
        double unionPartImaginary = imaginaryPart1 + imaginaryPart2;
        double parteImaginaryDesapareciente = imaginaryPart3 * -1;
        double FinalRealPart = realPart + parteImaginaryDesapareciente;
        return new Complejo(FinalRealPart, unionPartImaginary);
    }
    //public Complejo Divicion(Complejo num){
    //  double reverseTwoImg = num.imaginary * -1;
    //Complejo numInvertido = new Complejo(num.real, reverseTwoImg);
    //Complejo PartUpp = this.Multiplicacion(numInvertido);
    //Complejo PartDown = num.Multiplicacion(numInvertido);
    //return new Complejo()
    //}
    public void ImprimirComplejo()
    {
        if (this.imaginary < 0)
        {
            Console.WriteLine("Su numero complejo resultante es: (" + this.real + " " + this.imaginary + "i)");
        }
        else
        {
            Console.WriteLine("Su numero complejo resultante es: (" + this.real + " + " + this.imaginary + "i)");
        }
    }
}