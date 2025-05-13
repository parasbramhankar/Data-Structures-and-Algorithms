package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    static int linearSearch(int[]arr,int ele){
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                return i;
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
        System.out.println("Enter the element to be searched:");
        int ele=scanner.nextInt();

        int index=linearSearch(arr,ele);

        System.out.println("Index: "+ index);
        System.out.println("Position: "+(index+1));
    }
}
