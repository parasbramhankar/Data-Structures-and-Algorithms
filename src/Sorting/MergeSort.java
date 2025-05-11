package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {


    public static void merge(int[]arr,int low,int mid,int high){

        int[]temp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else if(arr[i]>arr[j]){
                temp[k]=arr[j];
                j++;
                k++;
            }
        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }

        while(j<=high){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(int m=low;m<=high;m++){
            arr[m]=temp[m-low];
        }


    }
    public static void mergeSort(int []arr,int low,int high){
        if(low>=high){
            return;
        }

        int mid=(low+high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        mergeSort(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }
}
