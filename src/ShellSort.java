public class ShellSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int i = intArray.length / 2 ; i > 0; i /= 2){

            for (int j = i; j < intArray.length; j++){
                int ele = intArray[j];
                int x = j;
                while(x >= i && intArray[x - i] > ele){
                    intArray[x] = intArray[x - i];
                    x -= i;

                }
                intArray[x] = ele;
            }
        }

        for (int i = 0; i <= intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
