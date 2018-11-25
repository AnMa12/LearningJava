package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static jdk.nashorn.internal.runtime.JSType.toInteger;

public class Main {
    private static final int DEFAULT_BUCKET_SIZE = 5;

    public static void InsertionSort(Integer[] list)
    {
        for (int i = 1; i < list.length; i++) {
            Integer item = list[i];
            int indexHole = i;
            while (indexHole > 0 && list[indexHole - 1] > item) {
                list[indexHole] = list[--indexHole];
            }
            list[indexHole] = item;
        }
    }

    public static void sort(Integer[] array, int bucketSize) {
        if (array.length == 0) {
            return;
        }

        // Determine minimum and maximum values
        Integer minValue = array[0];
        Integer maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        // Initialise buckets
        int bucketCount = (maxValue - minValue) / bucketSize + 1;
        ArrayList<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<Integer>());
        }

        // Distribute input array values into buckets
        for (int i = 0; i < array.length; i++) {
            buckets.get((array[i] - minValue) / bucketSize).add(array[i]);
        }

        // Sort buckets and place back into input array
        int currentIndex = 0;
        for (int i = 0; i < buckets.size(); i++) {
            Integer[] bucketArray = new Integer[buckets.get(i).size()];
            bucketArray = buckets.get(i).toArray(bucketArray);
            InsertionSort(bucketArray);
            for (int j = 0; j < bucketArray.length; j++) {
                array[currentIndex++] = bucketArray[j];
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[] {4,8,2,3,9,2,3};
        sort(a, DEFAULT_BUCKET_SIZE);
        for(int i = 0; i < a.length; i++)
        System.out.println(toInteger(a[i]));
    }

}