package BASICS;

import java.util.Scanner;

public class Inputs {
    void main(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int rollno = input.nextInt();
        System.out.println("Your Roll Number:" + rollno);

        // Literals and identifiers

        String name = input.next();//input.next() means take the next word thing that comes up from the keyboard
        //if it was input.nextInt() it would take the next int from the keyboard
        System.out.println("Your name:" + name);

        float marks  = input.nextFloat();;
        System.out.println("Your marks:" + marks);
    }

}
