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

public class recursion {

    public static void printInc( int n ){
        if( n == 1){
            System.out.print(n+ " ");
            return ;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);

    }
}