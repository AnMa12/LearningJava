package com.company;

class Main {

    public static int binarySearch(int val, int[] array, int left, int right) {
        if(left > right)
            return -1;
        int mid = (left + right)/2;
        if(val ==  array[mid])
            return mid;
        else if(val < array[mid])
            return binarySearch(val, array, left, mid-1);
        else
            return binarySearch(val, array, mid+1, right);
    }

    public static int binarySearchIterative(int val, int[] array) {
        int left = 0;
        int right = array.length -1;
        int mid = 0;
        while(left <= right) {
            mid = (left + right)/2;
            if(val < array[mid])
                right = mid - 1;
            else if (val > array[mid])
                left = mid + 1;
            else
                return mid;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(binarySearch(1, new int[]{1, 2, 3, 4, 5, 6, 7, 8},0,7));
        System.out.println(binarySearchIterative(1, new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
}
