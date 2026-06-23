public class Java3 {

    public static void main(String[] args) {
        //Intergers
        // Byte, Short, Integers, long
        // byte b = 2;
        short s = 220;
        int i = 2200;
        long l = 500000;

        // Binary , Octal, Hexadecimal
        // byte b = 0b10; // Binary
        // byte b = 07; //Octal (0 -> 7)
        byte b = 0x1A; // Hexadecimal
        System.out.println("Integers No. --> " + b + ", " + s + ", " + i + ", "+ l);

        // Real Number
        // float , double 

        float f = 1.23f;
        // double d = 2.3452; --> Standard way 
        double d = 6.022e23; // 6.022 * 10^23
        System.out.println("Floating No. --> " + f + ", " + d);

        //Characters
        char c = 'a';
        System.out.println("Character --> " + c);

        // Boolean
        boolean bool = false;
        System.out.println("Boolean Value --> " + bool);
    }
} 