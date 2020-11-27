package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введен массив: ");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //int[] arr = {1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        //int[] arr = {208, 353, 395, 47, 104, 9, 96, 323, 553};

        String intArrayString = Arrays.toString(arr);
        System.out.println(intArrayString);
        System.out.println("Длинной: " + arr.length);
        System.out.println();

        //Сортируем массив пузырьковой сортировкой
        //int [] bubbleSortArray = BubbleSort.bubbleSort(arr);
        //BubbleSort.print(bubbleSortArray);

        //Сортируем массив сортировкой слиянием
        int[] mergeSortArray = MergeSort.mergeSort(arr);
        MergeSort.print(mergeSortArray);


        arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //arr = new int[]{9, 47, 96, 104, 208, 323, 353, 395, 553};
        //arr = new int[]{208, 353, 395, 47, 104, 9, 96, 323, 553, 13, 44};

        //Сортируем массив быстрой сортировкой
        int[] quickSortArray = QuickSort.quickSort(arr, 0, arr.length -1);
        QuickSort.print(quickSortArray);
    }
}
