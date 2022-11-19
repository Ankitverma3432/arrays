package array;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int [] result = printSmallestAndLargest(arr);

        System.out.println("The smallest element in given array is: " + result[0]);
        System.out.println("The largest element in given array is: " + result[1]);



    }
    public static int[] printSmallestAndLargest(int[] arr){
        Arrays.sort(arr);
        int []ans = {arr[0], arr[arr.length-1]};
        return ans;
    }
}
