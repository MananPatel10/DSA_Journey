package BASICS.ASSIGNMENT;

import java.util.Scanner;

public class Ans3 {
    void main(){
        Scanner ip = new Scanner (System.in);
        System.out.println("please enter the principle");
        int principle = ip.nextInt();
        System.out.println("please enter the time");
        int time = ip.nextInt();
        System.out.println("please enter the rate");
        int rate = ip.nextInt();

        int SI= (principle*time*rate)/ 100;

        System.out.println("Your simple interest is : " + SI);



    }
}
