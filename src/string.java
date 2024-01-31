import java.util.Scanner;

public class string {
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
