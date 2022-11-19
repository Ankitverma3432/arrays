package Arrays;

import java.util.Scanner;

public class minElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size =  sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of array : ");
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int minValue = printMin(arr);

        System.out.println("The minimum value in given array is: "+ minValue);
    }

    public static int printMin(int[] arr){
        int min = arr[0];

        for(int i=0; i<arr.length;i++){
            min = Math.min(min,arr[i]);
        }
        return min;
    }

}
