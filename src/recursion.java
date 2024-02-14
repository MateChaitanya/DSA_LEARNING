/*
//print number from n to 1 ( Decreasing order)
public class recursion {

    public static void printDec ( int n ){
        if(n == 1){
            System.out.println(n);
            return ;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}

 */
//=====================================================================================================================
//Print numbers from n to 1 ( increasing order )

/*public class recursion {

    public static void printInc( int n ){
        if( n == 1){
            System.out.println(1)  ;
            return ;
        }
        printInc(n-1);
        System.out.println(n+ " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);

    }
}

 */
//====================================================================================================
//print factorial of a number n

/* public class recursion {

    public static int fact(int n ){
        if(n ==0){
            return 1;
        }
        int fnm1  = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}

 */
//=====================================================================================================================================
//Sum of first n natural number
/*
public class recursion {

    public static int calSum( int n ){
        if(n == 1){
            return 1;
        }
        int Snm1 = calSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calSum(n));

    }
}

 */
//========================================================================================================
//Print Nth fibonacci number
/*
public class recursion{
    public static int fib(int n ){
        if(n == 0 || n ==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2 ;
        return fn;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(fib(n));
    }
}

 */
//============================================================================================
//Check whether given array is sorted or not
/*
public class recursion {
    public static boolean isSorted( int arr[],int i){
        if(i ==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,6,3,4,5};
        System.out.println(isSorted(arr,0));
    }
}

 */
//===================================================================================================
//Write a function to find the first occurence of an elemnet in an array
/*
public class recursion {
    public static int firstOccurence ( int arr[],int key , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i ;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr, 5, 0));
    }
}

 */
//===================================================================================
//print X^n
/*
public class recursion {
    public static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        return x*power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}

 */
//==================================================================================================
//Tiling problem

public class recursion {

    public static int tillingProblem(int n ){
        //2 x n ( floor Size)
        //base case

        if(n == 0 || n == 1){
            return 1;
        }

        //kaam
        //vertical choice

        int fnm1 = tillingProblem(n-1);

        //Horizonatl Choice

        int fnm2 = tillingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;

    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(5 ));
    }
}

