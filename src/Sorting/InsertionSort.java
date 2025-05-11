package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {


    public static void insertionSort(int[]arr){

        int n=arr.length;

        for(int i=1;i<n;i++){
            int ele=arr[i];
            int ind=i-1;

            while(ind>0 && ele<=arr[ind]){
                arr[ind+1]=arr[ind];
                ind--;
            }
            ind++;
            arr[ind]=ele;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
