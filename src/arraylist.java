import java.util.ArrayList;
/*
public class arraylist {
    public static void main(String[] args) {
        int n = 10;

        //Declaring the ArrayList with initial size n
        ArrayList<Integer> arr1 = new ArrayList<>(n);

        //Declaring the ArrayList
        ArrayList<Integer> arr2 = new ArrayList<>();

        //Printing the ArrayList

        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        //appending the new element at the end of the list

        for (int i = 0; i < n; i++) {
            arr1.add(i);
            arr2.add(i);

        }

        //printing the arraylist

        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

    }
}

 */
//======================================================================================================================
//Operations performed in ArrayList
//1. Adding Elements


class arraylist{
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Geeks");
        a1.add("Geeks");

        a1.add(1,"For");

        System.out.println(a1);
    }
}