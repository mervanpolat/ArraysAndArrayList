import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = input.nextInt();
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //Enhanced for-loop
        for(int[] a : arr) { //for every array, arr
            System.out.println(Arrays.toString(a));
        }

        for(int[] a : arr) { //for every array, arr
            System.out.println(Arrays.toString(a));
        }
    }
}



