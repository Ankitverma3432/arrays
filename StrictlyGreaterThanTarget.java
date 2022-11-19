package array;

import java.util.Scanner;

public class StrictlyGreaterThanTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target Element: ");
        int target = sc.nextInt();

        int result = printStrictlyGreater(arr,target);

        System.out.println("The total number of elements which are strictly greater than "+ target + " is : " + result);
    }

    public static int printStrictlyGreater(int[] arr,int target){
        int count = 0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]>target){  // the elements strictly
                count++;
            }
        }
        return count;
    }
}
