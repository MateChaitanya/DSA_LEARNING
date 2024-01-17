// Abstraction using Java code

// Abstract class representing the basic functionalities of a remote control
/* abstract class RemoteControl {
    // Abstract method to turn the device on
    public abstract void turnOn();

    // Abstract method to turn the device off
    public abstract void turnOff();

    // Abstract method to change the channel
    public abstract void changeChannel(int channel);

    // Abstract method to adjust the volume
    public abstract void adjustVolume(int volume);
}

// Concrete implementation of a TV remote control
class TVRemoteControl extends RemoteControl {

    public void turnOn() {
        System.out.println("TV is turned on");
    }


    public void turnOff() {
        System.out.println("TV is turned off");
    }

    public void changeChannel(int channel) {
        System.out.println("Changing TV channel to " + channel);
    }

    public void adjustVolume(int volume) {
        System.out.println("Adjusting TV volume to " + volume);
    }
}

// Main class to demonstrate abstraction
public class Abstraction {
    public static void main(String[] args) {
        // Using abstraction to interact with a TV through its remote control
        RemoteControl tvRemote = new TVRemoteControl();

        tvRemote.turnOn();
        tvRemote.changeChannel(5);
        tvRemote.adjustVolume(20);
        tvRemote.turnOff();
    }
}

 */

/*
//Encapsulation

// Java Program to demonstrate
// Java Encapsulation

// fields to calculate area
class Area {
    int length;
    int breadth;

    // constructor to initialize values
    Area(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea()
    {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Abstarction {
    public static void main(String[] args)
    {

        Area rectangle = new Area(2, 16);
        rectangle.getArea();
    }
}
*/


/*
// Java Program to demonstrate
// Java Encapsulation

class Name {
    // Private is using to hide the data
    private int age;

    // getter
    public int getAge() { return age; }

    // setter
    public void setAge(int age) { this.age = age; }
}

// Driver Class
class Abstraction {
    // main function
    public static void main(String[] args)
    {
        Name n1 = new Name();
        n1.setAge(19);
        System.out.println("The age of the person is: "
                + n1.getAge());
    }
}
*/

// Java Program to implement To display the
// method print the addition and subtraction
// by using abstraction

// Abstract Class
abstract class arithmetic_operation {
    abstract void printInfo();
}

// Class add
class add extends arithmetic_operation {
    // class add must override printInfo() method
    // otherwise, compile-time
    // exception will be thrown
    void printInfo()
    {
        int a = 3;
        int b = 4;
        System.out.println(a + b);
    }
}

// Class sub
class sub extends arithmetic_operation {
    // class sub must override printInfo() method
    // otherwise, compile-time
    // exception will be thrown
    void printInfo()
    {
        int c = 4;
        int d = 5;
        System.out.println(c - d);
    }
}

// Driver Class
class abstraction {
    // Main Function
    public static void main(String args[])
    {
        arithmetic_operation n = new add();
        n.printInfo();
        arithmetic_operation y = new sub();
        y.printInfo();
    }
}
