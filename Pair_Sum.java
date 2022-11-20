package array;

import java.util.Scanner;

public class Pair_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target value : ");
        int target = sc.nextInt();

        int result = printPairSum(arr,target);

        System.out.println("The total number of pairs whose sum is equal to target are: " + result);

    }
    public static int printPairSum(int []arr, int target){
        int count= 0;
        for(int i=0; i<arr.length;i++){  //first Number
            for(int j=i+1; j<arr.length;j++){  //second Number
                if(arr[i]+ arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
}
