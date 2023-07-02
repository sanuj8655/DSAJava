public class CountSort
{
    public static void main(String[] args) {
        int[] intArray = {2, 3, 5, 9, 1, 3, 6 , 9, 7, 4};
        countSort(intArray , 1, 10);
        for (int i = 0 ; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void countSort(int[] arr, int min, int max){
        int[] countArray = new int[(max - min) + 1];
        for (int i = 0; i < arr.length; i ++){
            countArray[arr[i] - min]++;

        }
        int j = 0;
        for (int i = min; i <= max; i++ ){
            while(countArray[i - min ] > 0){
                arr[j++] = i;
                countArray[i - min]--;

            }
        }
    }


}
