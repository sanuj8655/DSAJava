public class SelectSort {
    public static void main(String[] args) {
        int[] intArray = {2, -4, 5, 66, 90, 12, 31};

        for (int i = intArray.length - 1; i > 0; i--) {
            int largest = 0;
            for (int j = 1; j <= i; j++) {
                if (intArray[largest] < intArray[j]) {
                    largest = j;
                }

            }
            swap(intArray, largest, i);

        }

        for (int i = 0; i <= intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
        } else {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

        }
    }


}
