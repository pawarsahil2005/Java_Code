public class Java8 {

    public static void main(String[] args) {

        // Right angled Triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        // Perpendicular T
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 3) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Pyramid Printing

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int s = 1; s <= i; s++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        System.out.println();
        // Pascal Triangle
        for (int i = 1; i <= 5; i++) {
            int val = 1;

            for(int s = 1; s <= 5 - i ; s++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++)
            {
                System.out.print(val + " ");

                val = val * (i - j) / j;
            }

            System.out.println(); 
        }
        
    }
}