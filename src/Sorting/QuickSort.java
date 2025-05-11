package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    static int partition(int[]arr,int low,int high){

        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){

            while(i<high && pivot>=arr[i]){
                i++;
            }

            while(j>low && pivot<=arr[j]){
                j--;
            }

            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }

        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;

    }

    public static void quickSort(int []arr,int low,int high){

        if(low<high){
            int partIndex=partition(arr,low,high);

            quickSort(arr,low,partIndex-1);
            quickSort(arr,partIndex+1,high);

        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        quickSort(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }
}
