package array;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        //Example: {1, 1, 3, 4, 2, 3, 5, 7, 0}
        System.out.println("Enter the elements of array : ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int result = printPeak(arr);
        System.out.println("The peak element in the given array is: " + result);
    }

    public static int printPeak(int[] arr){

        int peak=0;
        for(int i=1; i<arr.length-1;i++){
            if(arr[i-1]<=arr[i] && arr[i]>=arr[i+1]){
                peak = arr[i];
            }
        }
        return peak;

    }
}
