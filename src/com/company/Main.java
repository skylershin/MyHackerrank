package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        if (ar.length == 1) {
            printArray(ar);
            return;
        }

        for (int i=1; i<ar.length;i++) {
            int current = ar[i];
            for (int j=i-1; j>=0;j--) {
                if (current < ar[j]) {
                    ar[j+1] = ar[j];
                    if (j == 0) {
                        ar[j] = current;
                        printArray(ar);
                    }
                } else if(current > ar[j]) {
                    ar[j+1] = current;
                    printArray(ar);
                    break;
                }
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
