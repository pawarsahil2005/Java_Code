// Constructor

public class Java13 {
    public static void main(String[] args){

        // Creating the object 
        Student s1 = new Student(); 

        // s1.name = "Sahil";
        // s1.age = 21;
        // s1.roll_no = 228;
        // s1.college = "PCCOE";
        
        /*
        Default values in the Java only for the instance variables 
        int = 0
        float = 0.0
        boolean = false
        String = null
        */

        // int x; // Local variables -> NO default values for the local variables --> store the stack memory
        // System.err.println(x);
        s1.print();
    }
}

// defining the class -> Blueprint of the object
class Student{
    String name; // data/information/charactertics -> instance variables --> store in the Heap memory
    int age;
    String college;
    int roll_no;

    void markAttendence() // Behaviour -> instance methods
    {
        System.out.println("The attenedence is marked by "+ name);
    }

    void print()
    {
        System.out.println(name + " " + age + " "+ college + " "+ roll_no);
    }
}
