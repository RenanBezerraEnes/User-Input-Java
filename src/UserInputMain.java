import java.util.Scanner;

public class UserInputMain {
    public static void main(String[] args) {
        //Scanner is a class provided by Java to interact with Inputs
        Scanner sc = new Scanner(System.in);
        String firstStr = sc.nextLine();
        System.out.println("You entered : " + firstStr);
    }
}
