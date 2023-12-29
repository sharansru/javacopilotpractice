public class t3 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, -3, 8, 1, 9, 5, -1};


        int max = findMax(numbers);
        System.out.println("The maximum element in the array is: " + max);
    }

    public static int findMax(int[] arr) {
        
        int m = arr[0];

        for (int a : arr) {
            if (m < a) {
                m = a;
            }
        }

        return m;
    }
}

