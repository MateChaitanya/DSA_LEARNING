/*
public class Pattern {
    public static void main(String args[]){
        int n = 4;
        int m = 5;

        //outer loop
        for (int i = 1; i <=n ; i++) {
            //inner loop
            for(int j=1; j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}*/

/*class Pattern{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

/*class Pattern{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i<=n; i++) {
         //Inner loop
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //Inner loop
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

class Pattern{
    public static void hallow_rectangle( int totRows, int totCols){

        //Outer loop -> 1 to totRows
        for (int i = 1; i <= totRows ; i++) {

            //Inner loop -> 1 to totCols
            for (int j = 1; j <= totCols; j++) {

                //boundary cells
                if (i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hallow_rectangle(4,5);
    }
}
