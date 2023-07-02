public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int i = 1; i < intArray.length; i++){
            int newEle = intArray[i];
            int x;
            for (x = i; x > 0 && intArray[x -1] > newEle ; x-- ){
                intArray[x] = intArray[x -1];

            }
            intArray[x] = newEle;
        }

       for (int i = 0 ; i <intArray.length; i++){
           System.out.println(intArray[i]);
       }

    }

}
