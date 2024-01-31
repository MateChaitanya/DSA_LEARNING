import javax.swing.plaf.PanelUI;
import java.util.Scanner;

/*public class string {
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        char arr[] = {'a','b','c','d'};
//        String str = "abcd";
//        String str2 = new String("xyz");
//
//        Scanner sc = new Scanner(System.in);
//        String name;
//        name = sc.next();
//        System.out.println(name);

        String firstname = "Chaitanya";
        String lastname = "Mate";
        String fullname = firstname +" "+ lastname;
        System.out.println(fullname);
        System.out.println(fullname.charAt(0));

        printLetters(fullname);
    }
}

 */
//==========================================================================================================
/* public class string{

    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) == str.charAt(n-1-i)){
                //not a palindrome
                return false  ;

            }
        }
        return true ;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));

    }
}
 */
//============================================================================================
//Q2.Given a short route containing 4 direction (EWNS)
// find the shortest path to reach destination
/*
public class string{

    public static float getShortestpath(String path){
        int x = 0 , y= 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //South
            if(dir =='S'){
                y--;
            }
            //North
            else if(dir =='N'){
                y++;
            }
            //West
            else if (dir =='W') {
                x--;
            }
            //East
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestpath(path));
    }
}

 */
//===============================================================================================
/*public class string{
    public static void main(String[] args) {
        String s1 ="Tony";
        String s2 ="Tony";
        String s3= new String("Tony");

//        if(s1 ==s2){
//            System.out.println("Strings are equal");
//        }else {
//            System.out.println("Strings are not equal");
//        }
//        if(s1 ==s3){
//            System.out.println("Strings are equal");
//        }else {
//            System.out.println("Strings are not equal");
//        }
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}

 */
//================================================================================
//Substring
/*public class string{

    public static String substring (String str, int si , int ei){
        String substr = " ";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "Helloworld";
        System.out.println(substring(str,0, 5));
    }
}

 */
//================================================================================
//For a given set of string print the largest string
//"apple","mango","banana"
//Use comapreTo function

public class string {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for (int i = 0 ; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
