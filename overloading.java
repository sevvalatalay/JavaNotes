public class overloading {
    static void print() {
        System.out.println("parametre yok.");
    }

    static void print(int a) {
        System.out.println("parametreli: " + a);
    }

    static void print(double a) {
        System.out.println("parametreli double: " + a);
    }

    static int print(int a, int b) {
        System.out.println(a + b);
        return a + b;

    }

    static int print(int a, int b, int c) {
        return a + b + c;

    }

    public static void main(String[] args) {
        print();
        print(3.5);
        print(3, 5);
        System.out.println(print(5, 6, 8));

    }
}
