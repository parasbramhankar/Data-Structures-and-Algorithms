package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[]arr){


        int n= arr.length;

        for(int i=0;i<n-1;i++){

            int ind=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[ind]){
                    ind=j;
                }
            }
            int ele=arr[ind];
            arr[ind]=arr[i];
            arr[i]=ele;
        }
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
