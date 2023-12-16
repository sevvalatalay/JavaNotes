import java.util.Scanner;

public class whileDemo2 {
    public static void main(String[] args) {
        int password;
        boolean ifPasswordSucces = false;
        try (Scanner inp = new Scanner(System.in)) {

            while (!ifPasswordSucces) {
                System.out.println("sifre giriniz");
                password = inp.nextInt();
                if (password == 123) {
                    System.out.println("sifre dogru");
                    ifPasswordSucces = true;
                } else {
                    System.out.println("sifre yanlis");
                }

            }
        }
    }
}
