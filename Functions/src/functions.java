import java.util.Scanner;

public class functions {
    static void main() {
        //Q: take input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();

        int sum = num1 +num2;
        System.out.println("The result is " + sum);

        // want to perform this may times then you cant just copy paste this code need to have functions
        //this code is dry then  --> code repeating itself


    }
}
