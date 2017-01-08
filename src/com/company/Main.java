package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCase = Integer.parseInt(scanner.nextLine());

        while(numberOfCase >0) {
            String text = scanner.nextLine();
            char[] chars = text.toCharArray();
            ArrayList<Character> evenList = new ArrayList();
            for (int i=0; i<chars.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(chars[i]);
                } else {
                    evenList.add(chars[i]);
                }
            }
            System.out.print(" ");
            for (char evenChar: evenList) {
                System.out.print(evenChar);
            }
            System.out.println();

            numberOfCase -= 1;
        }
    }

}
