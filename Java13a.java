// Constructor 

public class Java13a {
    public static void main(String[] args){

        // Constructor overloading
        Student s1 = new Student();
        // Student s2 = new Student("Sahil",21,"PCCOE",228);
        s1.print();
        // s2.print();
    }
}

class Student{
    String name;
    int age;
    String college;
    int roll_no;
    
    // default constructor
    Student()
    {

    }

    // parameterized Constructor 
    Student(String name, int age, String college, int roll_no){
        this.name = name; 
        this.age = age; 
        this.college = college; 
        this.roll_no = roll_no;
    }

    void print(){
        System.out.println(name + " "+ age+ " "+ college+" "+ roll_no);
    }
}
