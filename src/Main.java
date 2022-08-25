public class Main {
    

    public static void main(String[] args) {

        int[] array = new int[5];
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers

        //int[] basically means that "rollNumbers", which is a ref variable,
        // is pointing to an array object that contains the datatype of int.
        //int[] rollNumbers = new int[5]; //-> All datatypes have to be the same
        //or differently
        //int[] rollNumbers2 = {23, 43, 433, 65, 65, 54};

        //How does Arrays work?

        //int[] ros; //declaration of array. ros is getting defined in the stack
        //ros = new int[5]; //initialization: actually object is being created in the memory (heap)
        String[] arr = new String[5];
        System.out.println(arr[4]);
        //prints null
        String name = null;
    }

}