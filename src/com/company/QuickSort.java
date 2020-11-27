package com.company;

//Хныкин 3.2.
//Быстрая сортировка.
//Лучшая n (log n)
//Средняя n (log n)
//Худшая O(n2)

import java.util.Arrays;

public class QuickSort {

    private static int count = 0;

    private static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static int[] quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int divideIndex = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, divideIndex - 1);
            quickSort(arr, divideIndex, endIndex);
        }
        return arr;
    }

    private static int partition(int[] arr, int start, int end) {
        int rightIndex = end;
        int leftIndex = start;

        int supportElement = arr[start];
        while (leftIndex <= rightIndex) {
            //count++;
            while (arr[leftIndex] < supportElement) {
                leftIndex++;
                count++;
            }

            while (arr[rightIndex] > supportElement) {
                rightIndex--;
                count++;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    //Ф-ция печати
    public static void print(int [] arr) {
        String intArrayString = Arrays.toString(arr);
        System.out.println("Результат работы быстрой сортировки: ");
        System.out.println(intArrayString);
        System.out.println("Количество операций: " + count);
        System.out.println();
    }

}
