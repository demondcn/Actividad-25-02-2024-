import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        System.out.println("Quieres ver figuras? Di 1 para si o 0 para no");
        int respuesta = escaner.nextInt();


        if(respuesta==1){
            System.out.println("respuesta");
            System.out.println("***     *       *       *");
            System.out.println("*       *   *     *    *     * *");
            System.out.println("*       *  *       *  ***   *   *");
            System.out.println("*       *  *       *    *    *     *");
            System.out.println("*       *  *       *    *   *       *");
            System.out.println("*       *  *       *    *    *     * ");
            System.out.println("*       *   *     *     *     *   *");
            System.out.println("***     *       *       *");
        }
        else{
            System.out.println("Entonces no vea nada");
        }
    }

}