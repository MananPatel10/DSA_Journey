public class Swap {
    static void main() {
        int a = 10;
        int b = 20;


//        //swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a,b);

        System.out.println(a+ " "+ b);

        String name = "MANAN PATEL";
        changeName(name);
        System.out.println(name);
//        System.out.println(naam); cant use this here not for this scope  of the function

    }
    static void changeName(String naam){
        naam = "Rahul Rana";// creating new object
    }

    static void swap(int a  , int b){
        int temp = a;
        a = b;
        b= temp;

        //this change will only be valid in this function scope only.

    }
}
