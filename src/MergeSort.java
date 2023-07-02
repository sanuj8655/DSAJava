public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int n = intArray.length;
        divide(intArray, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int[] newArray = new int[ei - si + 1];
        int x = 0;
        int idx1 = si;
        int idx2 = mid + 1;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                newArray[x++] = arr[idx1++];
            } else {
                newArray[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            newArray[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            newArray[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < newArray.length; i++, j++) {
            arr[j] = newArray[i];

        }


    }


}
