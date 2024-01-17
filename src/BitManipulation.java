/*
public class BitManipulation {
    public static void main(String[] args) {
        System.out.println("Binary AND= "+(5&6));
        System.out.println("Binary OR = " +(5|6));
        System.out.println("Binary XOR = " +(5^6));
        System.out.println("Binary One's Complement = " +(~5));
        System.out.println("Binary Right Shift = " +(6>>1));
    }
}
 */
//================================================================================
//Q.Check If a Number is Odd or Even
class BitManipulation{
    public static void oddOrEven(int n) {
        int bitMask =1;
        if((n & bitMask)==0) {
            //even number
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static int getIthBit(int n,int i){
        int bitMask =1<<i;
        if((n & bitMask)==0 ) {
            return 0;
        }
        else{
            return 1;
        }

    }
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    public static int countSetBits(int n){
        int count =0;
        while(n > 0){
            if((n&1)!=0);
            {
                count++;
            }
            n= n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(15  ));
    }
}
