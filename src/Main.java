import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/*public class Main {
    public static void main(String[] args) {
        //Java Collection Framework
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Array List = " +list);

        //Get Operation
        int element = list.get(2);
        System.out.println("Element at Index 2 is = " + element);

        //Delete
       // list.remove(2);
        //System.out.println("List after Removing the integer = "+ list);

        //Set Element at index
        list.set(2,10);
        System.out.println("List After adding new Integer = "+ list);

        //Contain Checing if number exists in list

        System.out.println(list.contains(1));
        System.out.println(list.contains(11 ));

    }
}
 */
//======================================(SIZE OF ARRAYLIST)==========================
//.size()
/*
public class Main{
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size()  );


    }
}
 */
//===================================Print reverse of an arraylist ================================
/*public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        //Reverse print 

        for (int i = list.size()-1; i>=0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
 */
//====================================Find Maximum No from list =====================================
/*public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("Max Element = " + max);
    }
}
 */

//=====================================Sorting an Arraylist==================================================

/*public class Main {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

 */
//============================================Multi Dimensional Array ==========================================
/*public class Main {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);list.add(2);list.add(6);
       mainList.add(list);

       ArrayList<Integer> list2 = new ArrayList<>();
       list2.add(3);list2.add(4);list2.add(9);
       mainList.add(list2);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();

        }
        System.out.println(mainList);
    }
}

 */
//====================================Pair Sum =======================================

public class Main{

    //Brute Force
    public static boolean pairSum1(ArrayList<Integer> list , int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5 ;
        System.out.println(pairSum1(list,target));
    }
}