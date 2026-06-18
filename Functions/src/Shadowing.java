public class Shadowing {
    static int x = 90;//this will be shadowed at line 8
    static void main() {
        System.out.println(x);//90
        fun();
        int x; // the class variable at line 2 is shadowed by this line
//        System.out.println(x); // ERROR !! in this line as the value is not initialized
        //scope will begin when the value is initialized
        x=40;
        System.out.println(x);//40
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
