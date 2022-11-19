package array;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_smallest_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter kth smallest and kth largest target: ");
        int k = sc.nextInt();

        int []result = printSmallestAndLargest(arr,k);
        System.out.println("The kth smallest element is: " + result[0]);
        System.out.println("The kth largest element is: " + result[1]);
    }

    public static int[] printSmallestAndLargest(int[]arr, int k){

        Arrays.sort(arr);
        int smallest = arr[k-1];
        int largest = arr[arr.length-k];
        int [] ans = {smallest,largest};

        return ans;


    }
}
