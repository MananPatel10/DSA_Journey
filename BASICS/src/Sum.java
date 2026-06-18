package BASICS;

import java.util.Scanner;

public class Sum {
    void main(){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);
    }
}
