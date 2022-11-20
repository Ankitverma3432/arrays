package array;

import java.util.Scanner;

public class UniqueNumber_notRepeated_Twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int result = printNotRepeatedNumber(arr);
        System.out.println("The unique number which is non-repeated is : " + result);
    }

    public static int printNotRepeatedNumber(int []arr){

        for(int i=0; i<arr.length;i++){   // traversing over first element
            for(int j=i+1; j<arr.length;j++) {  //traversing over second element
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }

        }
        int unique = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=-1){
                 unique = arr[i];
            }
        }

        return unique;
    }
}
