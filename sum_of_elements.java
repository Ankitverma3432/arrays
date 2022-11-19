package Arrays;

import java.util.Scanner;

public class sum_of_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of your array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int result = printSum(arr);
        System.out.println("Sum of elements of the array : " + result);
    }

    public static int printSum(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
           sum = sum+arr[i];
        }
        return sum;
    }
}
