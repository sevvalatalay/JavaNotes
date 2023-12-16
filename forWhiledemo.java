import java.util.Scanner;

public class forWhiledemo {
    public static void main(String[] args) {
        int sayi;
        try (Scanner inp = new Scanner(System.in)) {

            // for (boolean run = true; run;) {
            // System.out.println("sayi giriniz");
            // sayi = inp.nextInt();
            // if (sayi < 0) {
            // System.out.println("negatif girdiniz program bitti");
            // run = false;

            // }
            // }
            do {
                System.out.println("sayi giriniz");
                sayi = inp.nextInt();
            } while (sayi > 0);

        }
    }
}
