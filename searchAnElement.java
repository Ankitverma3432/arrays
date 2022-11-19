package array;

import java.util.Scanner;

public class searchAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        int index = searchTarget(arr, target);
        System.out.println("The index of target element in given array is : "+ index);
    }

    public static int searchTarget(int[] arr,int target){
        int ans = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
