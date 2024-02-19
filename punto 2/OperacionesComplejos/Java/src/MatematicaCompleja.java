import javax.swing.JOptionPane;
public class MatematicaCompleja {
    public static void main(String[] args) {
        String Hola = JOptionPane.showInputDialog("Por favor, introduce tu nombre:");

        int opccion = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduce una opcion de las siguientes:" +
                "\n 1.Suma" +
                "\n 2.Resta" +
                "\n 3.Multiplicacion" +
                "\n "));
        double real1 = Double.parseDouble(JOptionPane.showInputDialog("de su numero complejo que numero es la parte real"));
        double img1 = Double.parseDouble(JOptionPane.showInputDialog( "de su numero complejo que numero es la parte imaginaria"));
        double real2 = Double.parseDouble(JOptionPane.showInputDialog( "de su segundo numero complejo que numero es la parte real"));
        double img2 = Double.parseDouble(JOptionPane.showInputDialog( "de su segundo numero complejo que numero es la parte imaginaria"));
        Complejo num1 = new Complejo(real1,img1 );
        Complejo num2 = new Complejo(real2,img2);

        switch (opccion){
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