import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        String UserName, password;
        int right = 3;
        int balance = 1500;
        int select;
        try (Scanner inp = new Scanner(System.in)) {
            while (right > 0) {
                System.out.println("kullanici adiniz:");
                UserName = inp.nextLine();
                System.out.println("sifreniz:");
                password = inp.nextLine();
                if (UserName.equals("sevval") && password.equals("123")) {
                    System.out.println("bankaya hosgeldiniz");
                    do {

                        System.out.println(

                                "1-para yatirma\n" +
                                        "2-para cekme\n" +
                                        "3-bakiye sorgula\n" +
                                        "4- cikis\n");
                        System.out.println("yapmak istediniz islemi seciniz.");
                        select = inp.nextInt();
                        if (select == 1) {
                            System.out.println("para miktari giriniz:");
                            int price = inp.nextInt();
                            balance += price;
                        } else if (select == 2) {
                            System.out.println("para miktarini giriniz");
                            int price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("bakiyeniz yetersiz");

                            } else {
                                balance -= price;

                            }

                        } else if (select == 3) {
                            System.out.println("bakiyeniz: " + balance);

                        }

                    } while (select != 4);
                    System.out.println("gorusmek uzere.");

                    break;

                } else {
                    --right;
                    System.out.println("kullanici adiniz veya sifreniz hatali");
                    if (right == 0) {
                        System.out.println("hesabiniz bloke olmustur.");
                    } else {
                        System.out.println("kalan hakkiniz: " + right);
                    }

                }

            }

        }
    }
}
