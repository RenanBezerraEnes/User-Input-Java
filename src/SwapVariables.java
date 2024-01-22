import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        //Swap two variables using third variable

        int a,b, temp;
        System.out.println("Enter 2 values to swap");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of first variable : " + a);
        System.out.println("Value of second variable : " + b);
        //System.out.println("Value of first variable : " + a);
    }
}
