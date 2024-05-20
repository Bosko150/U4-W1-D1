import java.util.Arrays;

public class es1 {

    public static void main(String[] args) {


        int risultatoMoltiplicazione = moltiplicazione(3, 5);

        System.out.println("il risultato della moltiplicazione è " + risultatoMoltiplicazione);

        String risultatoConcatenazione = concatenazione("ciao ", 5);

        System.out.println("il risultato della concatenazione è " + risultatoConcatenazione);



        String[] arrayresult = inserisciInArray(new String[]{"uno", "due", "tre", "quattro", "cinque"}, "sei");
        System.out.println(Arrays.toString(arrayresult));
    }


    public static int moltiplicazione(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatenazione(String str1, int num3) {
        return str1 + num3;
    }

    public static String[] inserisciInArray(String[] array, String str) {
        String[] array2 = new String[array.length + 1];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[2] = array[2];
        array2[3] = str;
        array2[4] = array[3];
        array2[5] = array[4];

        return array2;
    }
}


