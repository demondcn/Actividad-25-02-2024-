

public class MatematicaCompleja {

    //public static void SumarImaginarios(){

    //}
    //public static void SumarReales(int r1, int r2){
        //resultado

    //}


    public static void main(String[] args) {
        Complejo seleccion = new Complejo();
        int opcion = seleccion.seleccion;
        Complejo c1 =new Complejo();
        Complejo c2 =new Complejo();

        c1.MuestraComplejo("Complejo 1 ");
        c2.MuestraComplejo("Complejo 2 ");


        switch (opcion){
            case 1:
                Complejo c3=c1.sumcomplejo(c2);
                c3.MuestraComplejo("resultado de la suma");
                break;
            //case 2:
              //  Complejo c3=c1.rescomplejo(c2);
               // c3.MuestraComplejo("resultado de la resta");
               // break;
            //case 3:
                //Complejo c3=c1.divcomplejo(c2);
                //c3.MuestraComplejo("resultado de la suma");
                //break;
            //case 4:
                //Complejo c3=c1.multicomplejo(c2);
                //c3.MuestraComplejo("resultado de la suma");
                //break;
            default:
                c3.MuestraComplejo("usted no selecciono ninguna accion");
        }



        Complejo c3=c1.sumcomplejo(c2);
        c3.MuestraComplejo("resultado de la suma");
        //int[] RealNumbers = new int[2];
        //RealNumbers[0] = 1;
        //RealNumbers[1] = 3;
        //String[] ImaginarioNumber = new String[2];
        //ImaginarioNumber[0] = "2j";
        //ImaginarioNumber[1] = "-j";


        //System.out.println(SumarReales(RealNumbers[0],RealNumbers[1] ));




    }
}