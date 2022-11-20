package array;

import java.util.Scanner;

public class LastRepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int result = printLastRepeated(arr);

        System.out.println("The last repeated element is : "+result);
    }

    // {1,5,3,4,6,3,4}

    public static int printLastRepeated(int []arr){

        int repeated = -1;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    repeated=arr[i];
                }
            }
        }
        return repeated;
    }
}
