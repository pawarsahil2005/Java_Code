// OOP's Java

public class Java12 {
    public static void main(String[] args){

        // Creating the object 
        Student s1 = new Student(); 
        Student s2 = new Student();

        s1.name = "Sahil";
        s1.age = 21;
        s1.roll_no = 228;
        s1.college = "PCCOE";

        s2.name = "Yash";
        s2.age = 21;
        s2.roll_no = 226;
        s2.college = "PCCOE";

        s1.markAttendence();
        s2.markAttendence();
        s1.print();
        s2.print();
    }
}

// defining the class -> Blueprint of the object
class Student{
    String name;
    int age;
    String college;
    int roll_no;

    void markAttendence()
    {
        System.out.println("The attenedence is marked by "+ name);
    }

    void print()
    {
        System.out.println(name + " " + age + " "+ college + " "+ roll_no);
    }
}
