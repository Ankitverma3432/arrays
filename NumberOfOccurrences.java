package array;

import java.util.Scanner;

public class NumberOfOccurrences {
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

        int result =  printOccurrence(arr,target);
        System.out.println("The occurrence of "+ target + " in the given array is : "+result);
    }

    public static int printOccurrence(int[] arr, int target){
        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}
