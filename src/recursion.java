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