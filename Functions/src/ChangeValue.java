import java.util.Arrays;

public class ChangeValue {
    static void main() {
        //create an ARRAY
        int[] arr = {1,3,5,7,9};
        change(arr);
        System.out.println(Arrays.toString(arr));



    }

    static void change(int[] nums){
        nums[0]=99;//if you make change to the object via this ref variable , same object will be changed.

    }
}
