/**
 * largestNum
 */
public class largestNum {

    public static void main(String[] args) {
        int num1=30;
        int num2=40;
        int num3=20;

        int largestNum=num1;
        if(largestNum<num2)
        {
            largestNum=num2;
        }
        else if (largestNum<num3) {
            largestNum=num3;
            
        }
        System.out.println("the largest num is: "+largestNum);
    }
}