package BASICS;

import java.util.Scanner;

public class TypeCasting {
    void main(){
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println("Your number:" + num);

        //in this i input an integer but it conerts itself to float
        //WHEN DOES THIS HAPPEN??
        //1. Type should be compatible   i.e for eg char cant be converted to int but whereas int can be converted to float
        /*2.Destination type must be greater than given type
        * int num = input.nextFloat();
        * this will convert it from in t to float as float is greater than int
        * but on the other hand
        * float num = input.nextInt();
        * Gives an ERROR!!!!!    as the float is greater than the int
        */

        //NOW HOW TO CONVERT FLOAT TO INT??
        //here comes type casting

        int num1 = (int)(76.56f);
        System.out.println("Your number:" + num1);
        //now o/p is 76


        //AUTOMATIC TYPE PROMOTION IN AN EXPRESSION
        int a = 257;
        byte b = (byte)a;
        System.out.println("Your number:" + b);
        // max value of bute is 256 so it gives remainder of it
        //257 % 256 = 1 is the o/p here

        byte x= 50;
        byte y = 40 ;
        byte z = 100;
        int d = (x*y)/z;
        System.out.println(d);
        // a* b iss 2000 how it stores in byte format??
        //here java is directly promoting the byte values to integer for storing values

        //byte ab=50;
       // ab = ab*2; // will give error
        //as whenever you do operation on byte operation it converts to int so as you do it to int how can you store it to byte format now


        int number = 'A';
        System.out.println(number);
        //automatic type conversion ASCII value
        //java is unicode format UTF so you can use any language in it

        //Rules for type promotion
        //1.  all byte short and char are promoted to int
        //2.  if any one of the operant(i.e multiply ke aju and baju wale number)  if long then whole operation is to float , double then double
        //E.g sout(3* 5.573938)







    }
}
