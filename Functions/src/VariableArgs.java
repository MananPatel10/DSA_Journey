import java.util.Arrays;

public class VariableArgs {
    static void main() {
        fun(2,3,4,5,6,78,7,85,66);
        multiple(2, 3 , "Manan" ,"Kunal" , "Raju");

    }

    static void multiple(int a , int b, String...v){
        //variable length args always at the end

    }
    static void fun(int...v){
        //int...v make an array of int
        //char...a makes arr of char (this v , a can be kept anything)
        System.out.println(Arrays.toString(v));

    }
}
