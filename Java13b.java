// Constructor chaining 

public class Java13b {
    public static void main(String[] args){

        // Student s1 = new Student();
        // Student s2 = new Student("Sahil");
        // Student s3 = new Student("Yash",18);
        // Student s4 = new Student("Ram",20,"PCCOE");
        // Student s5 = new Student("Shyam",21,"PCCOE",885);
    }
}

class Student {
    String name;
    int age;
    String college;
    int roll_no;

    Student(){ 
        // this("Unknown", 0, "Unknown", 0); // Direting to complete parameterized constructor
        this("Unknown");
        System.out.println("I am 1st constructor...");
    }

    Student(String name){
        
        this(name,0);
        System.out.println("I am 2nd constructor...");
    }

    Student(String name , int age){

        this(name, age, "Unknown");
        System.out.println("I am 3rd constructor...");
    }

    Student(String name , int age, String college){
        this(name,age,college,0);
        System.out.println("I am 4th constructor...");
    }

        Student(String name, int age, String college, int roll_no){
        this.name = name; 
        this.age = age; 
        this.college = college; 
        this.roll_no = roll_no;
        System.out.println("I am 5th constructor...");
    }

}
