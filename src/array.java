import java.util.Scanner;

/*public class array {
    public static void main(String[] args) {
        //int marks[] = new int[50];

        //int numbers[] = { 1,2,3};

        //User Input
        int marks[] = new int [100];
        Scanner sc = new Scanner(System.in);
        //int phy;
        //phy = sc.nextInt();

        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//maths

        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("maths: " + marks[2]);

        //update the maths marks
        marks[2]=100;
        System.out.println("maths: " + marks[2]);

        //calculate percentage
        int percentage = ( marks[0]+ marks[1] + marks[2])/3;
        System.out.println("percentage = " + percentage + "%");

    }
}
 */

//====================================================================================================================
/*
//Passing arrays as argument
public class array {

    //Marks will get updated by 1
    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        update(marks);

        //print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
*/
//==========================================================================================
//Find the index of element in given array
/*
public class array{

    public static int linearSearch(int numbers[], int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]= { 2,4,6,8,10,12,14,16};
        int key = 10;

        int index =linearSearch(numbers,key);
        if (index ==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("KEY IS AT INDEX : " + index);
        }
    }
}

 */

//================================================================================================================
//Find the largest number in given array
/*
public class array {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }

            System.out.println("Smallest value is :" + smallest );
            return largest;

        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};

        System.out.println("Largest Vlaue is :" + getLargest(numbers ));

    }
}

 */
//================================================================================================================
  //Binary Search
/*
public class array{

    public static int binarySearch ( int numbers[], int key){
        int start = 0 ,end = numbers.length-1;

        while(start <= end ){
            int mid = (start + end )/2;

            //compare
            if (numbers[mid] == key ){
                return mid;
            }
            if (numbers[mid]<key){
                return mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = { 2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("Index for key is :" + binarySearch(numbers , key));
    }
}
 */
//===============================================================================================================
//Reverse an array
/*
public class array {

    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last){
            //swap

            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {

            System.out.print  (numbers[i] + " ");
        }
        System.out.println();
    }
}

 */
//========================================================================================================
//Piars in array
public class array {

    public static void printPairs(int numbers[]){
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i]; //2,4,6,8,10
            for (int j = i+1; j<numbers.length;j++) {
                System.out.print("(" + curr +","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = { 2,4,6,8,10};
        printPairs(numbers);
    }
}