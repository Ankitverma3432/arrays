package array;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int result = printSecondSmallest(arr);
        System.out.println("The second smallest element in the given array is : " + result);
    }

    // { 1,2,3,4,5 }

    public static int printSmallest(int[]arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }

    public static int printSecondSmallest(int []arr){

        int smallest = printSmallest(arr);

        for(int i=0; i<arr.length;i++){
            if(arr[i]==smallest){
                arr[i]= Integer.MAX_VALUE;

            }
        }

        int secondSmallest = printSmallest(arr);
        return secondSmallest;
    }
}
