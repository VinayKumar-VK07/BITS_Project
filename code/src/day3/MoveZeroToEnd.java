package day3;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void solution(int[] arr) {

        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,4,0,0,3};
        solution(arr);     
        System.out.println(Arrays.toString(arr));   
    }
}
