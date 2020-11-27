package com.company;

//Хныкин 3.2.
//Сортировка Слиянием.
//Средняя n (log n)
//Худшая n (log n)

import java.util.Arrays;

public class MergeSort{

    private static int count = 0;

    //Ф-ция сортировки
    public static int[] mergeSort(int[] array) {
        int[] tmp;
        int[] arrIn = array;
        int[] arrOut = new int[array.length];

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(arrIn, i, arrIn, i + size, arrOut, i, size);
            }

            tmp = arrIn;
            arrIn = arrOut;
            arrOut = tmp;

            size = size * 2;
        }
        return arrIn;
    }


    //Ф-ция слияния подмассивов
    private static void merge(int[] arr1, int arr1StartElement, int[] arr2, int arr2StartElement, int[] arrResult, int destStart, int size) {
        int current1 = arr1StartElement;
        int current2 = arr2StartElement;

        int src1End = Math.min(arr1StartElement + size, arr1.length);
        int src2End = Math.min(arr2StartElement + size, arr2.length);

        int iterationCount = src1End - arr1StartElement + src2End - arr2StartElement;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (current1 < src1End && (current2 >= src2End || arr1[current1] < arr2[current2])) {
                arrResult[i] = arr1[current1];
                current1++;
                count++;
            } else {
                arrResult[i] = arr2[current2];
                current2++;
                count++;
            }
        }
    }

    //Ф-ция печати
    public static void print(int [] arr) {
        String intArrayString = Arrays.toString(arr);
        System.out.println("Результат работы сортировки Слиянием: ");
        System.out.println(intArrayString);
        System.out.println("Количество операций: " + count);
        System.out.println();
    }
}
