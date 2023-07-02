public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        sort(intArray, 0, intArray.length );

        for(int i = 0; i < intArray.length ; i ++) {
            System.out.println(intArray[i]);
        }
    }

    public static void sort(int[] arr, int start, int end){
        if (end - start < 2) {
            return;
        }
        int qIdx = partition(arr, start, end);
        sort(arr, start, qIdx);
        sort(arr, qIdx + 1, end);

    }

    public static int partition(int[] arr, int si, int ei){
        int i = si;
        int j = ei;
        int ele = arr[si];

        while ( i < j){

            while (i < j && arr[--j] >= ele);
            if (i < j){
                arr[i] = arr[j];
            }

            while (i < j && arr[++i] <= ele);
            if (i < j){
                arr[j] = arr[i];
            }

        }
        arr[j] = ele;
        return j;

    }
}
