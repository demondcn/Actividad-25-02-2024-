import javax.swing.*;

public class Main {

    public static void Cuadrado() {
        System.out.println("su imprecion de cuadrado es:");
        System.out.println(
                "******************" +
                        "\n*                *" +
                        "\n*                *" +
                        "\n*                *" +
                        "\n*                *" +
                        "\n*                *" +
                        "\n*                *" +
                        "\n*                *" +
                        "\n*                *" +
                        "\n******************");
    }

    public static void Circulo() {
        System.out.println("su imprecion de su Circulo es:");
        System.out.println(
                "    *******    " +
                        "\n  *         *  " +
                        "\n *            * " +
                        "\n *            * " +
                        "\n *            * " +
                        "\n *            * " +
                        "\n *            * " +
                        "\n  *          *  " +
                        "\n    *******    ");
    }

    public static void Flecha() {
        System.out.println("su imprecion de su Fecha es:");
        System.out.println(
                "       *       " +
                        "\n      ***      " +
                        "\n     *****     " +
                        "\n    *******    " +
                        "\n       *       " +
                        "\n       *       " +
                        "\n       *       " +
                        "\n       *       " +
                        "\n       *       ");
    }

    public static void Rombo() {
        System.out.println("su imprecion de su Rombo es:");
        System.out.println(
                "              *                " +
                        "\n           *     *             " +
                        "\n        *           *          " +
                        "\n     *                 *       " +
                        "\n  *                       *    " +
                        "\n*                            * " +
                        "\n  *                       *    " +
                        "\n     *                 *       " +
                        "\n        *           *          " +
                        "\n           *     *             " +
                        "\n              *                ");
    }


    public static void main(String[] args) {
        String Hola = JOptionPane.showInputDialog("Por favor, introduce tu nombre:");
        int opccionSalida = 5;
        do {
            int opccion = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduce una opcion de las siguientes:" +
                    "\n 1.Cuadrado" +
                    "\n 2.Circulo" +
                    "\n 3.Flecha" +
                    "\n 4.Rombo"));
            do {
                switch (opccion) {
                    case 1:
                        Cuadrado();
                        opccionSalida = Integer.parseInt(JOptionPane.showInputDialog("Desea seguir con el programa" + Hola + "precione 0??"));
                        break;
                    case 2:
                        Circulo();
                        opccionSalida = Integer.parseInt(JOptionPane.showInputDialog("Desea seguir con el programa" + Hola + "precione 0??"));
                        break;
                    case 3:
                        Flecha();
                        opccionSalida = Integer.parseInt(JOptionPane.showInputDialog("Desea seguir con el programa" + Hola + "precione 0?"));
                        break;
                    case 4:
                        Rombo();
                        opccionSalida = Integer.parseInt(JOptionPane.showInputDialog("Desea seguir con el programa" + Hola + "precione 0??"));
                        break;
                }
            } while (opccion > 4);
        } while (opccionSalida == 0);


    }
}
