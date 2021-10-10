package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    int n;
    int[] arr;

    private void getValuesFromUser(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt(); //number of elements

        System.out.println("Enter the elements one by one");
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arr));
    }

    private void sort(int[] arr){
        boolean isSorted;
        for(int j=0; j<arr.length; j++){
            isSorted =true;
            for(int k=1; k < arr.length-j; k++){
                if(arr[k] < arr[k-1]){
                    swap(arr, k, k-1);
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void main(String[] args){
        BubbleSort bs = new BubbleSort();
        bs.getValuesFromUser();
        bs.sort(bs.arr);
    }
}
