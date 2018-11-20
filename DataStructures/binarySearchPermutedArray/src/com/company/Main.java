package com.company;

public class Main {

    public static int binarySearchPermuted(int x, int[] array) {
        //find where the order breaks
        int orderBreakIndex = 0;
        for(int i = 0; i < array.length - 1; i++)
            if(array[i+1] < array[i]) {
                orderBreakIndex = i;
                break;
            }

        int left = 0;
        int right = 0;

        if(orderBreakIndex !=0 ) {
            if(x > array[0]) {
                left = 0;
                right = orderBreakIndex;
            }
            else {
                left = orderBreakIndex + 1;
                right = array.length - 1;
            }
        } else {
            left = 0;
            right = array.length - 1;
        }
        int mid = 0;
        while(left <= right) {
            mid = (left + right) / 2;
            if(array[mid] == x)
                return mid;
            else if(array[mid] > x)
                right = mid-1;
            else
                left = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearchPermuted(7, new int[]{8, 9, 10, 2, 4, 5, 6, 7}));
    }
}
