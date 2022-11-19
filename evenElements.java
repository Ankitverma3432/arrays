package array;

import java.util.Scanner;

public class evenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length;i++){ //traversing over array
            arr[i]=sc.nextInt();
        }

        System.out.println("The even elements in the array are: ");
        for(int i=0; i<arr.length;i++){ //traversing over array
            if(arr[i]%2==0){  // even
                System.out.println(arr[i]);
            }
        }
    }
}
