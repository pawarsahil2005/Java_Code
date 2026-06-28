// Functions 

public class Java11 {
    public static void main(String[] args) {
    //     greet();
    //     sayHello("Sahil");
    //     System.out.println(getnumber());
    //     System.out.println(multiply(45,18));

    System.out.println(sum(45,18));
    System.out.println(sum(45,18,7));
    System.out.println(sum(20.5, 10.5));
    greet(45, "Rohit");
    greet("Virat", 18);
    }

    // // No ip , No op
    // static void greet()
    // {
    //     System.out.println("Hello");
    // } 

    // // ip , No op
    // static void sayHello(String name)
    // {
    //     System.out.println("Hello " + name);
    // }

    // // No ip , op
    // static int getnumber()
    // {
    //     return 16;
    // }

    // // ip , op
    // static int multiply(int a, int b)
    // {
    //     return (a * b);
    // }

    // Function overloading 

    static int sum(int a,int b)
    {
        return (a+b);
    }

    static int sum(int a,int b, int c) // Different number of parameters
    {
        return (a+b+c);
    }

    static int sum(double a, double b) // Different types of parameters 
    {
        return (int) (a+b);
    }

    static void greet(String name, int age)
    {
        System.out.println("My name is " + name + " and age is " + age);
    }

    static void greet(int age, String name) // Different ordering of the parameters
    {
        System.out.println("His name is " + name + " and age is " + age);
    }
}
