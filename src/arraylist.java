import java.util.ArrayList;
import java.util.Collections;
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

/*
class arraylist{
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Geeks");
        a1.add("Geeks");

        a1.add(1,"For");

        System.out.println(a1);
    }
}

 */
//=================================================================================================
//2. Changing Elements
/*
class arraylist {

    // Main driver method
    public static void main(String args[])
    {
        // Creating an Arraylist object of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to Arraylist
        // Custom input elements
        al.add("Geeks");
        al.add("Geeks");

        // Adding specifying the index to be added
        al.add(1, "Geeks");

        // Printing the Arraylist elements
        System.out.println("Initial ArrayList " + al);

        // Setting element at 1st index
        al.set(1, "For");

        //  Printing the updated Arraylist
        System.out.println("Updated ArrayList " + al);
    }
}

 */
//=====================================================================================================
//3. Removing Elements

/*
class arraylist {

    // Main driver method
    public static void main(String args[])
    {
        // Creating an object of arraylist class
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to ArrayList
        // Custom addition
        al.add("Geeks");
        al.add("Geeks");
        // Adding element at specific index
        al.add(1, "For");

        // Printing all elements of ArrayList
        System.out.println("Initial ArrayList " + al);

        // Removing element from above ArrayList
        al.remove(1);

        // Printing the updated Arraylist elements
        System.out.println("After the Index Removal " + al);

        // Removing this word element in ArrayList
        al.remove("Geeks");

        // Now printing updated ArrayList
        System.out.println("After the Object Removal "
                + al);
    }
}

 */
//==============================================================================================
//4. Iterating the ArrayList
/*
class arraylist {

    // Main driver method
    public static void main(String args[])
    {
        // Creating an Arraylist of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to ArrayList
        //  using standard add() method
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < al.size(); i++) {

            System.out.print(al.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : al)
            System.out.print(str + " ");
    }
}

 */
//==========================================================================================
//5. Get Elements
/*
class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add the numbers

        list.add(9);
        list.add(5);
        list.add(6);
        System.out.println(list);

        //get method

        Integer n = list.get(1);
        System.out.println("at index 1 number is :" + n);
    }
}

 */

//=============================================================================
//6. Add Elements Between Two Numbers
/*
class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(list);
        // insert missing element 3
        list.add(2, 3);
        System.out.println(list);
    }
}

 */
//=========================================================================================
//7. ArrayList Sort
/*
class arraylist {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        System.out.println("Before sorting list:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("after sorting list:");
        System.out.println(list);
    }
}

 */
//=================================================================================================

//8. Size of Elements
class arraylist {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int b = list.size();
        System.out.println("The size is :" + b);
    }
}