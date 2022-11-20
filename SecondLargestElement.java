package array;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int result = printSecondLargest(arr);
        System.out.println("The second largest element in the given array is: "+ result);
    }

    public static int printLargest(int []arr){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int printSecondLargest(int []arr){
        int largest = printLargest(arr);
        for(int i=0; i<arr.length;i++){
            if(arr[i]==largest){
                arr[i]= Integer.MIN_VALUE;
            }
        }

        int secondLargest = printLargest(arr);
        return secondLargest;
    }
}
