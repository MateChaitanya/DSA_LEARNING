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

public class recursion {

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