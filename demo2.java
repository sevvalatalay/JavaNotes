import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        double tutar;
        double kdvOran = 0.18;
        System.out.println("tutar giriniz:");
        Scanner inp = new Scanner(System.in);
        tutar = inp.nextDouble();
        System.out.println("tutariniz: " + tutar);

        double miktar = tutar * kdvOran;
        System.out.println("kdv miktari: " + miktar);
        double kdvli = tutar + miktar;
        System.out.println("kdvli: " + kdvli);

    }

}
