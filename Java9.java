// Array

public class Java9 {
    public static void main(String[] args) {

        // // declaration of the array
        // int[] arr = new int[3]; // int arr[] = new int[3];
        // arr[0] = 100;
        // arr[1] = 101;
        // arr[2] = 102;

        // System.out.println(arr.length);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // 2-D Array

        int[][] marks = new int[3][3];
        /*
         * [1][2][3]
         * [4][5][6]
         * [7][8][9]
         */
        marks[0][0] = 1;
        marks[0][1] = 2;
        marks[0][2] = 3;
        marks[1][0] = 4;
        marks[1][1] = 5;
        marks[1][2] = 6;
        marks[2][0] = 7;
        marks[2][1] = 8;
        marks[2][2] = 9;

        for(int row = 0; row < marks.length; row++)
        {
            for(int col = 0; col < marks[row].length; col++)
            {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
    }
}
