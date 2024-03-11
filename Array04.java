//Написать функцию добавления элемента в конец массива таким образом, чтобы она расширяла массив при необходимости.

import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        Integer[] array1 = {12, 2, 5, null, null};
        Integer[] array2 = {12, 2, 5, 10, 9};
        System.out.println(Arrays.toString(addElementToArray(array1, 777)));
        System.out.println();
        System.out.println(Arrays.toString(addElementToArray(array2, 777)));
    }

    static Integer[] addElementToArray(Integer[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = element;
                return arr;
            }
        }
        Integer[] newArray = Arrays.copyOf(arr, arr.length * 2);
        newArray[arr.length] = element;
        return newArray;
    }
}
