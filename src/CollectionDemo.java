/*// Java program to illustrate Collection interface

import java.util.*;

public class CollectionDemo {
    public static void main(String args[])
    {

        // creating an empty LinkedList
        Collection<String> list = new LinkedList<String>();

        // use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        // Output the present list
        System.out.println("The list is: " + list);

        // Adding new elements to the end
        list.add("Last");
        list.add("Element");

        // printing the new list
        System.out.println("The new List is: " + list);
    }
}

 */

/*
// Java program to demonstrate removing
// elements from a Collection

import java.util.*;

public class CollectionDemo {
    public static void main(String[] argv) throws Exception
    {

        // Creating object of HashSet<Integer>
        Collection<Integer> set1 = new HashSet<Integer>();

        // Populating arrset1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        // print set1
        System.out.println("Initial set1 : " + set1);

        // remove a particular element
        set1.remove(4);

        // print modified set1
        System.out.println("set1 after removing 4 : " + set1);

        // Creating another object of HashSet<Integer>
        Collection<Integer> set2 = new HashSet<Integer>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        // print set2
        System.out.println("Collection Elements to be removed : " + set2);

        // Removing elements from set1
        // specified in set2
        // using removeAll() method
        set1.removeAll(set2);

        // print arrset1
        System.out.println("set 1 after removeAll() operation : " + set1);
    }
}

 */


/* -----------------------------------------------------Java program to Demonstrate List Interface------------------------------------------------------------

// Importing all utility classes
import java.util.*;

// Main class
// ListDemo class
class CollectionDemo {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an object of List interface
        // implemented by the ArrayList class
        List<Integer> l1 = new ArrayList<Integer>();

        // Adding elements to object of List interface
        // Custom inputs

        l1.add(0, 1);
        l1.add(1, 2);

        // Print the elements inside the object
        System.out.println(l1);

        // Now creating another object of the List
        // interface implemented ArrayList class
        // Declaring object of integer type
        List<Integer> l2 = new ArrayList<Integer>();

        // Again adding elements to object of List interface
        // Custom inputs
        l2.add(1);
        l2.add(2);
        l2.add(3);

        // Will add list l2 from 1 index
        l1.addAll(1, l2);

        System.out.println("l1 = "+ l1);

        // Removes element from index 1
        l1.remove(1);

        // Printing the updated List 1
        System.out.println("Updated List = "+ l1);

        // Prints element at index 3 in list 1
        // using get() method
        System.out.println("Element at index 3 in list 1 ="+ l1.get(3));

        // Replace 0th element with 5
        // in List 1
        l1.set(0, 5);

        // Again printing the updated List 1
        System.out.println("Again Printing the updated list 1 ="+ l1);
    }
}
 */


/*
//------------------------------------------------------Adding elements to List class using add() method-------------------------------------------------------


// Java Program to Add Elements to a List

// Importing all utility classes
import java.util.*;

// Main class
class CollectionDemo {

    // Main driver method
    public static void main(String args[])
    {
        // Creating an object of List interface,
        // implemented by ArrayList class
        List<String> al = new ArrayList<>();

        // Adding elements to object of List interface
        // Custom elements
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        // Print all the elements inside the
        // List interface object
        System.out.println(al);
    }
}
*/
//------------------------------------Updating elements----------------------------------------------------------------------------------------
/*
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class CollectionDemo{
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();

        a1.add("Geeks");
        a1.add("Geeks");
        a1.add(1,"Geeks");

        System.out.println("Initial ArrayList " + a1);

        a1.set(1,"For");
        System.out.println("Updated ArrayList " + a1);
    }
}
*/
//-------------------------------- Searching for elements -----------------------------------------------------------
/*
// Java Program to Remove Elements from a List

// Importing List and ArrayList classes
// from java.util package
import java.util.ArrayList;
import java.util.List;

// Main class
class CollectionDemo {

    // Main driver method
    public static void main(String args[])
    {

        // Creating List class object
        List<String> al = new ArrayList<>();

        // Adding elements to the object
        // Custom inputs
        al.add("Geeks");
        al.add("Geeks");

        // Adding For at 1st indexes
        al.add(1, "For");

        // Print the initialArrayList
        System.out.println("Initial ArrayList " + al);

        // Now remove element from the above list
        // present at 1st index
        al.remove(1);

        // Print the List after removal of element
        System.out.println("After the Index Removal " + al);

        // Now remove the current object from the updated
        // List
        al.remove("Geeks");

        // Finally print the updated List now
        System.out.println("After the Object Removal "
                + al);
    }
}
*/
//--------------------------------------------Accessing Elements------------------------------------------------------------------
/*
// Java Program to Access Elements of a List

// Importing all utility classes
import java.util.*;

// Main class
class CollectionDemo {
    // Main driver method
    public static void main(String args[])
    {
        // Creating an object of List interface,
        // implemented by ArrayList class
        List<String> al = new ArrayList<>();

        // Adding elements to object of List interface
        al.add("Geeks");
        al.add("For");
        al.add("Geeks");

        // Accessing elements using get() method
        String first = al.get(0);
        String second = al.get(1);
        String third = al.get(2);

        // Printing all the elements inside the
        // List interface object
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(al);
    }
}
*/

//--------------------------------------------------Checking if an element is present in the List----------------------------------------------------

// Java Program to Check if an Element is Present in a List

// Importing all utility classes
/* import java.util.*;

// Main class
class CollectionDemo {
    // Main driver method
    public static void main(String args[])
    {
        // Creating an object of List interface,
        // implemented by ArrayList class
        List<String> al = new ArrayList<>();

        // Adding elements to object of List interface
        al.add("Geeks");
        al.add("For");
        al.add("Geeks");

        // Checking if element is present using contains()
        // method
        boolean isPresent = al.contains("Geeks");

        // Printing the result
        System.out.println("Is Geeks present in the list? "
                + isPresent);
    }
}
*/
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------ArrayList------------------------------------------------------------------------------------------------------------------

/*
// Java program to demonstrate the
// working of ArrayList
import java.io.*;
import java.util.*;

class ArrayListExample {
    public static void main(String[] args)
    {
        // Size of the
        // ArrayList
        int n = 5;

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

        // Declaring the ArrayList
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++) {
            arr1.add(i);
            arr2.add(i);
        }

        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);
    }
}*/
//=====================================================Operations performed in ArrayList============================================================================
/*
// Java Program to Add elements to An ArrayList

// Importing all utility classes
import java.util.*;

// Main class
class CollectionDemo {

    // Main driver method
    public static void main(String args[])
    {
        // Creating an Array of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to ArrayList
        // Custom inputs
        al.add("Geeks");
        al.add("Geeks");

        // Here we are mentioning the index
        // at which it is to be added
        al.add(1, "For");

        // Printing all the elements in an ArrayList
        System.out.println(al);
    }
}

 */
//==============================================Changing Elements==================================================================================
/*
// Java Program to Change elements in ArrayList

// Importing all utility classes
import java.util.*;

// main class
class CollectionDemo {

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

        // Printing the updated Arraylist
        System.out.println("Updated ArrayList " + al);
    }
}

 */
//==============================================================Removing Elements====================================================================
/*
// Java program to Remove Elements in ArrayList

// Importing all utility classes
import java.util.*;

// Main class
class CollectionDemo {

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
//=================================================Add Elements Between Two Numbers============================================================================
/*// Java program to add the elements
// between two numbers in ArrayList
import java.io.*;
import java.util.*;
class CollectionDemo {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList();
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
//=============================================ArrayList Sort=========================================================================
/*
// Java Program for ArrayList Sorting
import java.io.*;
import java.util.*;

class CollectionDemo {
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

//======================================================================================================================================================================
//======================================================================================================================================================================
//======================================================================================================================================================================
//===========================================================Methods for Java LinkedList:===============================================================================

/*
// Java Program to Demonstrate
// Implementation of LinkedList
// class

// Importing required classes
import java.util.*;

// Main class
public class CollectionDemo {

    // Driver code
    public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
*/

//==============================================Map Interface In java =============================================================================================

// Java Program to illustrate the Hashmap Class

// Importing required classes
import java.util.*;

// Main class
public class CollectionDemo {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty HashMap
        Map<String, Integer> map = new HashMap<>();

        // Inserting entries in the Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
}



