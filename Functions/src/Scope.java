public class Scope {
    static void main() {
        int a = 10;
        int b = 20;
        String name = "Manan";
//        System.out.println(num); cant access here as it has scope for method only
        {
//            int a  = 78; // cant write again as this is in the main only
            a = 78;// reassign the original reference variable to some other new value
            int c = 99;
            name = "ATUL";
            System.out.println(name);
            //anything inaltilized in this block remains in this block but updating can be done here
        }
//        System.out.println(c); if we create value only for block than it will end in that block only so cant use anywhere else in main
        // but if initialized outside a block in the same method hence you cannot initialize again

        System.out.println(name);

        //Scoping in for loop
        for (int i = 0; i <= 10; i++) {
            System.out.println("*");
        }
//        i=97; cannot use outside for loop that is initialized in for loop.


        //HENCE THESE ARE 2 THINGS INIATILIZING AND UPDATING
    }

    static void random(){
//        System.out.println(a); can only access in main only
        int  num = 67;
        System.out.println(num);
    }
}
