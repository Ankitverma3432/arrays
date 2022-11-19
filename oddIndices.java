package Arrays;

import java.util.Scanner;

public class oddIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        String [] arr = new String[size];

        System.out.println("Enter the elements of the array (only strings) : ");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.next();
        }

        System.out.println("The elements of the array which are at odd index are: ");
        for(int i=0; i<arr.length; i++){
            if(i%2!=0){   //odd index
                System.out.println(arr[i]);
            }
        }

    }
}
