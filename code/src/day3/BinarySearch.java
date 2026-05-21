package day3;

import java.util.Arrays;

public class BinarySearch {

    public static boolean solution(int[] arr, int key) {

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            
            int mid = start + (end - start) / 2;

            if(key < arr[mid]) {
                start = mid;
            } else if (key > arr[mid]) {
                start =  mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,2,4,8,10};

        if(solution(arr, 2 )) {
            System.err.println("Element is present");
        } else {
            System.out.println("Element not found");
        }
        
    }
}
