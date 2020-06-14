package BaseTasks;

public class MyArray {

    public static int getMinElementInArray (int[] arr) {
        int minElement=arr[0];
        int i = 1;
        int arrLength = arr.length;
        while ( i < arrLength ){
           minElement = (arr[i]<minElement) ? arr[i] : minElement;
           i++;
        }
        return minElement;
    }

    public static int getMaxElementInArray (int[] arr) {
        int maxElement=arr[0];
        int i = 1;
        int arrLength = arr.length;
        while ( i < arrLength ){
           maxElement = (arr[i]>maxElement) ? arr[i] : maxElement;
           i++;
        }
        return maxElement;
    }

    public static int getIndexOfMinElementInArray (int[] arr) {
        int indexOfMin=0;
        int i = 0;
        int arrLength = arr.length;
        while ( i < arrLength ){
            indexOfMin = (arr[i]<arr[indexOfMin]) ? i : indexOfMin;
            i++;
        }
        return indexOfMin;
    }

    public static int getSumOfOddNumsInArray (int[] arr) {
        int sumOfOddNums=0;
        int i = 0;
        int arrLength = arr.length;
        while ( i < arrLength ){
            sumOfOddNums = (i%2!=0)? arr[i]+sumOfOddNums : sumOfOddNums;
            i++;
        }
        return sumOfOddNums;
    }

    public static int getCountOfOddNumsInArray (int[] arr) {
        int countOfOddNums=0;
        int i = 0;
        int arrLength = arr.length;
        while ( i < arrLength ){
            countOfOddNums = (i%2!=0)? countOfOddNums+1 : countOfOddNums;
            i++;
        }
        return countOfOddNums;
    }

    public static int[] getMidReversedArray (int[] arr) {
        int i = 0;
        int arrLength = arr.length;
        int midIndex = arrLength%2 == 0 ? arrLength/2 : arrLength/2 + 1;
        int temp;

        while ( i < arrLength/2 ){
            temp = arr[i];
            arr[i] = arr [midIndex+i];
            arr [midIndex+i] = temp;
            i++;
        }
        return arr;
    }

    public static int[] getReversedArray (int[] arr) {
        int i = 0;
        int arrLength = arr.length;
        int temp;

        while ( i < arrLength/2 ){
            temp = arr[i];
            arr[i] = arr [arrLength-i-1];
            arr [arrLength-i-1] = temp;
            i++;
        }
        return arr;
    }

    private static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    public static int[] getSortedArrayWithBubble (int[] arr) {
        int arrLength = arr.length;
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;
            for (int i = 1; i < arrLength; i++) {
                if(arr[i] < arr[i-1]){
                    isSorted = false;
                    swapElements(arr, i, i-1);
                }
            }
        }

        return arr;
    }

    public static int[] getSortedArrayWithSelect (int[] arr) {
        int minElelmIndex;
        int arrLength = arr.length;

        for (int left = 0; left < arrLength; left++) {
            minElelmIndex = left;
            for (int i = left; i < arrLength; i++) {
                if (arr[i] < arr[minElelmIndex]){
                    minElelmIndex = i;
                }
            }
            swapElements(arr, left, minElelmIndex);
        }
        return arr;
    }

    public static int[] getSortedArrayWithInsertion (int[] arr) {
        int arrLength = arr.length;

            for(int i=1;i<arrLength;i++){
            for(int j=i;j>0 && arr[j-1]>arr[j];j--) {
                swapElements(arr,j - 1, j);
                }
            }
        return arr;
    }

}
