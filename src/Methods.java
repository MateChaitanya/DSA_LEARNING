/*
class Addition {
    int sum =0;
    public int addTwoInt(int a, int b){
        sum=a+b;
        return  sum;
    }

}

public class Methods {
    public static void main(String[] args) {
        Addition add = new Addition();
        int s= add.addTwoInt(1,2);
        System.out.println("Sum of two integer is :" + s);
    }
}*/

/*public class Methods {

    // Method to add two numbers
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // Method to multiply two numbers
    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    // Main method (entry point of the program)
    public static void main(String[] args) {
        Methods myCalculator = new Methods();

        // Using the add method
        int sum = myCalculator.add(5, 3);
        System.out.println("Sum: " + sum);

        // Using the multiply method
        int product = myCalculator.multiply(4, 6);
        System.out.println("Product: " + product);
    }
}*/

class Addition {
    int sum = 0;

    public int addTwoInt(int a, int b) {
        sum = a + b;
        return sum;
    }
}
public class Methods{
        public static void main(String[] args) {
            Addition add  = new Addition();
        int s = add.addTwoInt(4,5);
            System.out.println("SUM :" +s);
        }
    }





