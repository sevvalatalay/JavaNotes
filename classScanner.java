
import java.util.Scanner;

public class classScanner {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        // a = input.nextInt();
        // System.out.println(a);
        String str = input.nextLine();
        System.out.println(str);
        input.close();
    }

}