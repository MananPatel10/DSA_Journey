package BASICS.ASSIGNMENT;

import java.util.Scanner;

public class Ans4 {
    void main(){
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        System.out.println("Pls enter operation + - / *");
        char op = ip.next().charAt(0);
        int ans = 0;

        if (op == '+') {
            ans = a+b;
        } else if (op == '-') {
            ans = a-b;
        } else if (op=='/') {
            ans = a/b;
        } else if (op == '*') {
            ans = a*b;
        }
        else{
            System.out.println("Pls enter correct operation");
        }

        System.out.println("your answer is " + ans);



    }
}
