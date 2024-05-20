public class es3 {
    public static void main(String[] args) {

        System.out.println(perim(3.4, 5.5));

        System.out.println(pariDispari(4));

        System.out.println(perimetroTriangolo(5.7, 6.4, 7.5));

    }
    public static double perim (double base, double altezza) {
        return (base + altezza) * 2;
    }

    public static int pariDispari (int num1){
        if (num1 % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static double perimetroTriangolo (double lato1, double lato2, double lato3){
        double semiP = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(semiP * (semiP - lato1) * (semiP - lato2) * (semiP - lato3));

    }
}
