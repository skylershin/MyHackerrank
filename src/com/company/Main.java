package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        String infoString = in.nextLine();
        String[] info = infoString.split(" ");
        int numOfElements = Integer.parseInt(info[0]);
        int numOfRotations = Integer.parseInt(info[1]);

        String object = in.nextLine();
        String[] objectArray = object.split(" ");

        String[] result = leftRotation(objectArray, numOfRotations, numOfElements);
        for (int i=0; i<result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length -1) {
                System.out.print(" ");
            }
        }
    }

    private static String[] leftRotation(String[] origin, int numOfRotations, int numOfElements) {
        String[] copied = new String[numOfRotations];
        String[] newArray = new String[numOfElements];

        for (int i=0; i< numOfElements; i++) {
            if (i < numOfRotations) {
                copied[i] = origin[i];
            } else {
                newArray[i - numOfRotations] = origin[i];
            }
        }

        for (int i=0; i < copied.length; i++) {
            newArray[numOfElements - numOfRotations + i] = copied[i];
        }

        return newArray;
    }
}
