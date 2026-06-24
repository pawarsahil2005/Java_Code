public class Java6 {

    public static void main(String[] args) {
        // Bitwise Operations
        
        // int a = 2; // 00000000 00000000 00000000 00000010
        // int b = 3; // 00000000 00000000 00000000 00000011
        // int c = a & b; // 2
        // int d = a | b; // 3
        // int e = a ^ b; // 1
        // int f = ~a; // 11111111 11111111 11111111 11111101 = -3
        // System.out.println(c + " " + d +" "+ e + " " + f );  
        
        // Shift operations 
        // 1) left shift (<<)
        int a = 1; //  00000000 00000000 00000000 00000001
        a = a << 32; // 00000000 00000000 00000000 00000010 = 2 '
        // a << 32 = a << 32 % 32 = a << 0
        System.out.println(a);

        // 2) Right shift (>> , >>>)
        // int b = 4;
        // b = b >> 1; // 2
        // System.out.println(b);

        byte b = -128;
        // b = (byte) (b >> 1); // -64
        // System.out.println(b);

        b = (byte) (b >>> 1);
        System.out.println(b);
    }
} 