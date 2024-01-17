/*public class DivideandConquer {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si,int ei){

        if(si>=ei){
            return;
        }
        int mid = si +(ei-si)/2;
        mergeSort(arr, si, mid);//left part
        mergeSort(arr,mid+1 ,ei);//right part
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid ,int ei) {
        int temp[]=new int[ei-si+1]; //temporary array
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for tem arr

        while (i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<= mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];

        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] ={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}*/

//==============================================BackTracking In java ========================================================
/*
//Backtracking - ARRAY
class DivideandConquer{
    public static void changeArr(int arr[],int i,int val){

        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion
        //assigning value to the index
        arr[i]=val;
        changeArr(arr,i+1,val+1); //function call step
        arr[i]=arr[i]-2; //backtracking step
    }

    public static void printArr(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
}
 */
//===================================Find Subsets=================================================
//Find & print all subsets of given string
//"abc"=a,b,c,ab,ac,bc,abc
/*
class DivideandConquer{
    public static void findSubsets(String str,String ans,int i){
        //Base Case
        if(i==str.length()){
            System.out.print(ans);
            return;
        }

        //recursion
        //yes Choice
        findSubsets(str,ans+str.charAt(i),i+1);
        //No Choice
        findSubsets(str,ans,i+1);

    }

    public static void main(String[] args) {
        String str ="abc";
        findSubsets(str,"    ",0);
    }


}

 */
//=======================================================Find Permutation============================================
/*
class DivideandConquer{
    public static void findPermutation(String str,String ans){
        //Base Case
        if(str.length()==0){
            System.out.println (ans);
            return;
        }
        //recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            //"abcde" = c ko hatao =>"ab"+"de"="abde"
           String Newstr = str.substring(0,i) + str.substring(i+1);
            findPermutation(Newstr,ans+curr);
        }

    }

    public static void main(String[] args) {
        String str ="abc";
        findPermutation(str," ");
    }


}
*/

//========================================N QUEEN ====================================================

public class DivideandConquer{

    public static void nQueens(char board[][],int row){

        //Base case
        if (row == board.length){
            printBoard(board);
            return;
        }

        //Column loop
        for (int j = 0; j < board.length; j++) {
            board[row][j]='Q';
            nQueens(board,row+1);//Function call
            board[row][j]='.';//backtracking step

        }
    }
    public static void printBoard(char board[][]){
        System.out.println("------ chess Board------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        int n=2;
        char board[][] = new char[n][n];
                //initialize
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j]='.';

                }

            }
            nQueens(board, 0);
        }
    }

