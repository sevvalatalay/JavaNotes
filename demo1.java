import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat, turkce, fizik, tarih, felsefe;
        System.out.println("mat notunuzu girin: ");
        mat = inp.nextInt();
        System.out.println("turkce notunuzu girin: ");
        tarih = inp.nextInt();
        System.out.println("fizik notunuzu girin: ");
        turkce = inp.nextInt();
        System.out.println("tarih notunuzu girin: ");
        fizik = inp.nextInt();
        System.out.println("felsefe notunuzu girin: ");
        felsefe = inp.nextInt();

        double ortalama;
        ortalama = (mat + turkce + fizik + tarih + felsefe) / 5;
        System.out.println("ortalamaniz " + ortalama);
        boolean sonuc = (ortalama >= 60);
        String str = sonuc ? "gectiniz" : "kaldiniz";
        System.out.println(str);

    }
}
