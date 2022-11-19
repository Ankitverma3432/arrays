package array;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int []arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int result = printMax(arr);
        System.out.println("The maximum element in the given array is : " + result);
    }

    public static int printMax(int[] arr){
        int max = arr[0];  //if max was kept initially 0,then it will give wrong result if all the elements in a give array is negative.
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
