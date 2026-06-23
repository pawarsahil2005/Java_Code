public class Java5 {

    public static void main(String[] args) {
        // Implicit typecasting
        // byte/short to int
        // byte b = 3;
        // int i;
        // i = b;
        // System.out.println(i); // 3

        // char to int
        // char c = 'a';
        // int i;
        // i = c;
        // System.out.println(i); //97

        // Explicit Coneversion 
        // int to byte
        int i = 300;
        byte b;
        b = (byte)i;
        System.out.println(b); // 300 is out of range of the byte 300 % 256 = 44

        // Truncating Conversion  
        float g = 12.34f;
        int o;
        o = (int) g;
        System.out.println(o);
    }
} 