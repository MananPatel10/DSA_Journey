import java.util.Scanner;

public class Sum {
    static void main() {

//        int ans  = Sum2();
//        System.out.println(ans);

        int ans;
        ans = sum3(20 , 50);
        System.out.println(ans);

    };

    //pass the value of number when you are calling the method inn main()
    static int sum3(int x, int b){
        int sum = x +b;
        return sum;
    }

    //return a value
    static int Sum2(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();

        int sum = num1 +num2;
//        System.out.println("The result is " + sum);
        return sum;
        //after return nothing executes after it and gives error
//        System.out.println("This will never execute");
    }



    static void Sum(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();

        int sum = num1 +num2;
        System.out.println("The result is " + sum);
    }

    /*

    access modifier(in OOPS) return_type NAME( arguments ){
          //body
          return statment;
    }
     */
}
