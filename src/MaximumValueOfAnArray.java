public class MaximumValueOfAnArray {

    public static void main(String[] args) {
        int[] arr = {13,3,253,943,18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 4));
    }



    static int max(int[] arr) {
        //Imagine that arr is not empty
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
        //prints 943
    }

    static int maxRange(int[] arr, int start, int end) {
        //Imagine that arr is not empty
        int maxValue = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
        //prints 943
    }
}

