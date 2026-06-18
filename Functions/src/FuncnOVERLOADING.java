public class FuncnOVERLOADING {
    static void main() {
        fun(5);
        fun("Manan");
        sum(5,8);
        sum(9,8,7);


    }

    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a , int b , int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);


    }

    static void fun(String name){
        System.out.println(name);

    }
}
