import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        String userName, password;
        try (Scanner inp = new Scanner(System.in)) {

            System.out.println("kullanici adiniz: ");
            userName = inp.nextLine();

            System.out.println("sifreniz: ");
            password = inp.nextLine();

            if (userName.equals("sevvalsu") && password.equals("1234")) {
                System.out.println("giris basarili");

            } else {
                System.out.println("kullanici adi veya sifreniz hatali");
            }

        }
    }
}
