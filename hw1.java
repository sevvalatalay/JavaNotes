import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            double boy, kilo, indeks;
            System.out.println("boyunuz metre cinsinden: ");
            boy = inp.nextDouble();
            System.out.println("kilonuz kg cinsinden: ");
            kilo = inp.nextDouble();
            indeks = kilo / (boy * boy);
            System.out.println(indeks);

        }

    }

}
