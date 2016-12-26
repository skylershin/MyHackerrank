package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        // 6X6 array.
        // [n][0] [n][1] [n][2]
        //        [n+1][1]
        // [n+2][0][n+2][1][n+2][2]

        int maximum = 0;
        for(int i=0; i<4; i++) {
            //row
            for(int j=0; j<4; j++) {
                //column
                int currentSum = 0;
                currentSum += arr[i][j];
                currentSum += arr[i][j+1];
                currentSum += arr[i][j+2];
                currentSum += arr[i+1][j+1];
                currentSum += arr[i+2][j];
                currentSum += arr[i+2][j+1];
                currentSum += arr[i+2][j+2];

                if (i==0 && j==0) {
                    maximum = currentSum;
                }

                if (maximum < currentSum) {
                    maximum = currentSum;
                }
            }
        }
        System.out.println(maximum);
    }
}
