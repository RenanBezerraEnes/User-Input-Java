import java.util.Scanner;

public class UserInputMain {
    public static void main(String[] args) {
        //Scanner is a class provided by Java to interact with Inputs
        System.out.println("Hello, what is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("I am " + age + " years old");
    }
}
