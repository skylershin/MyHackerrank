package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int lastAns = 0;
        Scanner in = new Scanner(System.in);
        String constraintsString = in.nextLine();
        String[] constraints = constraintsString.split(" ");

        int numOfSeq = Integer.parseInt(constraints[0]);
        int numOfQuery = Integer.parseInt(constraints[1]);
        List<List<Integer>> seqList = new ArrayList<>(numOfSeq);
        for (int i=0; i < numOfSeq; i++) {
            seqList.add(new ArrayList<>());
        }

        for (int i=0; i < numOfQuery; i++) {
            String queryString = in.nextLine();
            String[] queryParams = queryString.split(" ");
            int x = Integer.parseInt(queryParams[1]);
            int y = Integer.parseInt(queryParams[2]);


            if (Integer.parseInt(queryParams[0]) == 1) {
                firstQuery(x, y, lastAns, numOfSeq, seqList);
            } else if(Integer.parseInt(queryParams[0]) == 2) {
                lastAns = secondQuery(x, y, lastAns, numOfSeq, seqList);
                System.out.println(lastAns);
            }

        }
    }

    private static void firstQuery(int x, int y, int lastAns, int numOfSeq, List<List<Integer>> seqList) {
        int seqIndex = (x^lastAns)%numOfSeq;
        List<Integer> seq = seqList.get(seqIndex);
        seq.add(y);
    }

    private static int secondQuery(int x, int y, int lastAns, int numOfSeq, List<List<Integer>> seqList) {
        int seqIndex = (x^lastAns)%numOfSeq;
        List<Integer> seq = seqList.get(seqIndex);
        int lastAnsIndex = y%seq.size();
        return seq.get(lastAnsIndex);
    }

}
