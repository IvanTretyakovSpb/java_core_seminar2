//Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;

public class Array01 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 1, 6, 9, 101, 0, 5};
        System.out.println("min = " + findMin(arr));
        System.out.println("max = " + findMax(arr));
        System.out.println("minIndex = " + findMinIndex(arr));
        System.out.println("maxIndex = " + findMaxIndex(arr));
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int item : arr) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    static int findMinIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int findMaxIndex(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
