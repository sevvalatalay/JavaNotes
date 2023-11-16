public class reCapDemo2 {
    public static void main(String[] args) {
        double[] Mylist = { 1.2, 23.2, 32.3, 5 };
        double total = 0;
        double max = Mylist[0];

        for (double number : Mylist) {
            if (max < number) {
                max = number;

            }
            System.out.println(number);
            total += number;
        }
        System.out.println(total);
        System.out.println(max);
    }
}
