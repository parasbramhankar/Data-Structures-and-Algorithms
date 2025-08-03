package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int []arr,int ele){

        int n=arr.length;
        int low=0;
        int high=arr.length;

        while(low<=high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < ele) {
                low = mid + 1;
            } else if (arr[mid] > ele) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Enter element to be search: ");
        int ele= scanner.nextInt();

        int ind=binarySearch(arr,ele);

        System.out.println("Index: "+ind);
        System.out.println("Position: "+(ind+1));
    }
}


