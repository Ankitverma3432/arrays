package array;

import java.util.Scanner;

public class First_repeated_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int result = firstRepeated(arr);
        System.out.println("The first repeated value in the above array is: " + result);
    }

    public static int firstRepeated(int[]arr){

        // arr = {1,5,3,4,6,3,4}
        int repeated = -1;
        // traversing over pair
        for(int i=0; i<arr.length;i++){  //first number
            for(int j=i+1; j<arr.length;j++){   //second number
                if(arr[i]==arr[j]){
                    repeated = arr[j];

                   return repeated;
                }

            }
        }
        return repeated;
    }
}
