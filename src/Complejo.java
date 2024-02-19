import javax.swing.*;

public class Complejo {
    private float real;
    private float img;
    public int seleccion;

    public Complejo() {
        seleccion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione entre las siguientes acciones \n " +
                "que desea realizar " +
                "\n 1. para sumar" +
                "\n 2. para restar" +
                "\n 3. para dividir" +
                "\n 4. para multiplicar"));
        real = Float.parseFloat(JOptionPane.showInputDialog("Escriba la parte real del numero complejo"));
        img = Float.parseFloat(JOptionPane.showInputDialog("Escriba la parte imaginaria del numero complejo"));
        JOptionPane.showMessageDialog(null, "Constructor por defecto");
    }

    public Complejo(float a, float b) {
        real = a;
        img = b;
        JOptionPane.showMessageDialog(null, "Contructor argumentos");
    }


    //metodos
    public void MuestraComplejo(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje + "\n" + real + " , " + img + "i");
    }

    public Complejo sumcomplejo(Complejo c2) {
        Complejo c3 = new Complejo(0, 0);
        c3.real = real + c2.real;
        c3.img = img + c2.img;
        return c3;
    }
    public Complejo rescomplejo(Complejo c2) {
        Complejo c3 = new Complejo(0, 0);
        c3.real = real - c2.real;
        c3.img = img - c2.img;
        return c3;
    }
}