package BASICS;

import java.util.Scanner;

//package is the folder where your java file is lying
//this is imp bcuz we need to make like some things must be accesed to some packages and not to some
public class Basic_Concepts {
    // ALL THE BASIC CONCEPTS OF JAVA COVERED HERE

    public static void main(String[] args) {
//        without this main function the file wont work
//        public here means that is this is the main code so to run does it not make sense to make it avaliable to be executed from anywhere
//        STATIC here means that is we want to execute the main function without making an object for the Basic_Concept class , and so the variable and function that dont depend on the object are static variable and function
//        void is the return type of the function

//        String[] args this is arguments that is an array
//        System.out.println(args[0]);
//        now while compiling the code and running code it will store the value u give it in the array
//        like javac Demo.java
//        java 30 "Manan" --> this both will be stored in the the args array
//        System.out.println(args[1]);//will print Manan

        System.out.println("Hello World");
//        what is this sout? --> for printing part displaying part
        System.out.println("My name is MANAN PATEL");

        //HOW TO GET INPUT IN JAVA??
        //BY Scanner Class
        //will learn in deep in OOPS
        //it imports scanner class see above when we write scanner
        System.out.println("Hey how are you?");
        Scanner input =new Scanner (System.in);
//      here new is the new object being made for the scanner class
        // and system.in is taking the input from the keyboard--> system input
        System.out.println(input.nextLine());







    }
}