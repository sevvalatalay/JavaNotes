public class switchDemo {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Perfect, you passed.");
                break;
            case 'B':
                System.out.println("Great, you passed.");

                break;
            case 'F':
                System.out.println("I'm sorry, you failed.");
                break;
            default:
                System.out.println("You entered an invalid grade.");
        }
    }
}
