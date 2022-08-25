import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); //Pass index here, list[index] syntax won't work here
        }
    }
}


