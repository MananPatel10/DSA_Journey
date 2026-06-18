package Conditionals_and_Loops;

import java.util.Scanner;

public class Largest {
    void main(){
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        int max = a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println(max);

    }
}
