// Main.java
/*public class Main {
    // Fields or attributes
    String name;
    int age;

    // Constructor
    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Entry point of the program
    public static void main(String[] args) {
        // Creating objects of the Main class
        Main person1 = new Main("John Doe", 25);
        Main person2 = new Main("Jane Smith", 30);

        // Using the displayInfo method to show information about each person
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
} */

public class Objects {
    // sw=software
    static String sw_name;
    static float sw_price;

    static void set(String n, float p)
    {
        sw_name = n;
        sw_price = p;
    }

    static void get()
    {
        System.out.println("Software name is: " + sw_name);
        System.out.println("Software price is: "
                + sw_price);
    }

    public static void main(String args[])
    {
        Objects.set("Visual studio", 0.0f);
        Objects.get();
    }
}

