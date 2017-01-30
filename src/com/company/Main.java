package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> quickSort(int[] ar) {
        ArrayList<Integer> left = new ArrayList();
        ArrayList<Integer> equal = new ArrayList();
        ArrayList<Integer> right = new ArrayList();

        partition(left, equal, right, ar);

        int leftSize = left.size();
        int rightSize = right.size();

        if (leftSize > 1) {
            left = quickSort(array(left));
        }
        if (rightSize > 1) {
            right = quickSort(array(right));
        }

        return merge(left, equal, right);
    }

    static void partition(ArrayList<Integer> left,
                          ArrayList<Integer> equal,
                          ArrayList<Integer> right,
                          int[] ar)  {
        int pivot = ar[0];

        for (int element: ar) {
            if (element < pivot) {
                left.add(element);
            } else if (element == pivot) {
                equal.add(element);
            } else if (element > pivot) {
                right.add(element);
            }
        }
    }

    static ArrayList<Integer> merge(ArrayList<Integer> left,
                                    ArrayList<Integer> equal,
                                    ArrayList<Integer> right) {
        ArrayList resultList = new ArrayList();
        resultList.addAll(left);
        resultList.addAll(equal);
        resultList.addAll(right);
        printArray(array(resultList));

        return resultList;
    }

    static int[] array(ArrayList<Integer> list) {
        int[] result = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        quickSort(ar);
    }
}
