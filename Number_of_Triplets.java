package array;

import java.util.Scanner;

public class Number_of_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int result = printTriplets(arr,target);
        System.out.println("The total number of triplets whose sum is equal to that of target are : "+ result);
    }

    public static int printTriplets(int []arr, int target){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
