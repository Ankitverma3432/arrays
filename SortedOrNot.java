package array;

import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        boolean ans = isSorted(arr);
        System.out.println(ans);
    }

    // {1,2,3,4,5,6} if i<i-1 then array is not sorted
    public static boolean isSorted(int []arr){
        boolean check = true;
        for(int i=1; i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check= false;
            }
        }
        return check;
    }
}
