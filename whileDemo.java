public class whileDemo {
    public static void main(String[] args) {
        int left = 100, right = 200;
        while (++left < --right)
            ;
        System.out.println(left);
    }
}
