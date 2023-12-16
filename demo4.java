import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("dogdugunuz ay: ");
            month = input.nextInt();
            System.out.println("dogdugunuz gun: ");
            day = input.nextInt();
            switch (month) {
                case 1:
                    if (day >= 1 && day <= 31) {
                        if (day < 22) {
                            burc = "oglak";
                        } else {
                            burc = "kova";
                        }

                    } else {
                        isError = true;
                    }

                    break;
                case 2:
                    if (day >= 1 && day <= 28) {
                        if (day < 20) {
                            burc = "kova";
                        } else {
                            burc = "balik";
                        }

                    } else {
                        isError = true;
                    }

                    break;
                case 3:
                    if (day >= 1 && day <= 31) {
                        if (day < 21) {
                            burc = "balik";
                        } else {
                            burc = "koc";
                        }

                    } else {
                        isError = true;
                    }

                    break;

                default:
                    isError = true;

            }
            if (isError) {
                System.out.println("hatali giris yaptiniz.");

            } else {
                System.out.println("burcunuz:" + burc);
            }

        }
    }
}
