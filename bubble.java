import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 1, 5, 2 };
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}