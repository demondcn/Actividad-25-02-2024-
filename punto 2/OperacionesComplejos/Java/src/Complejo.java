import javax.swing.*;

public class Complejo {
    private double real;
    private double imaginary;

    //constructor
    public Complejo(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //metodos del objeto para realizar las respectivas Operaciones aritmeticas

    //Suma de numeros Complejos
    public Complejo Suma(Complejo num){
        double  realPart = this.real + num.real;
        double imaginaryPart = this.imaginary + num.imaginary;
        return new Complejo(realPart,imaginaryPart);
    }
    //Resta de numeros Complejos
    public Complejo Resta(Complejo num){
        double realPart = this.real - num.real;
        double imaginaryPart = this.imaginary - num.imaginary;
        return new Complejo(realPart,imaginaryPart);
    }
    public Complejo Multiplicacion(Complejo num){
        double realPart = this.real * num.real;
        double imaginaryPart1 = this.real * num.imaginary;
        double imaginaryPart2 = this.imaginary * num.real;
        double imaginaryPart3 = this.imaginary * num.imaginary;
        double unionPartImaginary = imaginaryPart1 + imaginaryPart2;
        double parteImaginaryDesapareciente = imaginaryPart3*-1;
        double FinalRealPart = realPart + parteImaginaryDesapareciente;
        return new Complejo(FinalRealPart,unionPartImaginary);
    }
    //public Complejo Divicion(Complejo num){
      //  double reverseTwoImg = num.imaginary * -1;
        //Complejo numInvertido = new Complejo(num.real, reverseTwoImg);
        //Complejo PartUpp = this.Multiplicacion(numInvertido);
        //Complejo PartDown = num.Multiplicacion(numInvertido);
        //return new Complejo()
    //}
    public void ImprimirComplejo(){
        if (this.imaginary < 0) {
            JOptionPane.showMessageDialog(null, "Su numero complejo resultante es: (" + this.real + " " + this.imaginary +"i)");
        }else{
            JOptionPane.showMessageDialog(null, "Su numero complejo resultante es: (" + this.real + " + " + this.imaginary +"i)");
        }


    }

}