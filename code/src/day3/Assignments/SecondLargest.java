package day3.Assignments;

public class SecondLargest {
    public static int solution(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if(arr[i] > sLargest && arr[i] < largest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,9,2};
        System.out.println(solution(arr));
    }
}
