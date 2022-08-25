import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 35;
//        arr[3] = 53;
//         arr[4] = 76;
        // [23, 45, 35, 53, 76]
        //System.out.println(arr[3]);

        // input using for loop
//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));
//
//        //for-each
//        for (int num : arr) { //for every element of the array, print the element
//
//            System.out.print(num + " "); // here num represents element (index) of the array.
//        }

        //array of objects
        String[] str = new String[4];
        for (int i = 0; i<str.length; i++) {
             str[i] = input.next();
            System.out.print(str[i] + " ");
        }
        System.out.println(Arrays.toString(str));

        // modify

        str[1] = "Kunal";
        System.out.println(Arrays.toString(str));

    }
}


