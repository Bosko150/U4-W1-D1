import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("inserisci la prima stringa");
        String firstStr = sc.nextLine();
        System.out.println("inserisci la seconda stringa");
        String secondStr = sc.nextLine();
        System.out.println("inserisci la terza stringa");
        String thirdStr = sc.nextLine();

        System.out.println(strSum(firstStr, secondStr, thirdStr));
        System.out.println(strSum(thirdStr, secondStr, firstStr));
    }

    public static String strSum(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

}
