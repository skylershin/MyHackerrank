package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int size = ar.length;
        int rightCell = ar[size - 1];
        for (int i= size -2; i >= 0; i--) {
            if (ar[i] > rightCell) {
                ar[i+1] = ar[i];
                printArray(ar);
                if (i == 0) {
                    ar[i] = rightCell;
                    printArray(ar);
                }
            } else if(ar[i] < rightCell) {
                ar[i+1] = rightCell;
                printArray(ar);
                break;
            }
        }
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
