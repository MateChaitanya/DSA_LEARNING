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

class Pattern{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <=n-1; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
