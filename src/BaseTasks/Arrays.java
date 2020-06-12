package BaseTasks;

public class Arrays {

    public int getMinElementInArray (int[] arr) {
        int minElement=arr[0];
        int i = 1;
        int arrLength = arr.length;
        while ( i < arrLength ){
           minElement = (arr[i]<minElement) ? arr[i] : minElement;
           i++;
        }
        return minElement;
    }

    public int getMaxElementInArray (int[] arr) {
        int maxElement=arr[0];
        int i = 1;
        int arrLength = arr.length;
        while ( i < arrLength ){
           maxElement = (arr[i]>maxElement) ? arr[i] : maxElement;
           i++;
        }
        return maxElement;
    }

    public int getIndexOfMinElementInArray (int[] arr) {
        int indexOfMin=0;
        int i = 0;
        int arrLength = arr.length;
        while ( i < arrLength ){
            indexOfMin = (arr[i]<arr[indexOfMin]) ? i : indexOfMin;
            i++;
        }
        return indexOfMin;
    }

    public int getSumOfOddNumsInArray (int[] arr) {
        int sumOfOddNums=0;
        int i = 0;
        int arrLength = arr.length;
        while ( i < arrLength ){
            sumOfOddNums = (i%2!=0)? arr[i]+sumOfOddNums : sumOfOddNums;
            i++;
        }
        return sumOfOddNums;
    }

    public int getCountOfOddNumsInArray (int[] arr) {
        int countOfOddNums=0;
        int i = 0;
        int arrLength = arr.length;
        while ( i < arrLength ){
            countOfOddNums = (i%2!=0)? countOfOddNums+1 : countOfOddNums;
            i++;
        }
        return countOfOddNums;
    }

    public int[] getMidfReversedArray (int[] arr) {
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

    public int[] getReversedArray (int[] arr) {
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



}
