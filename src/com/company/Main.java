package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static class Node {
        int data;
        Node next;
    }

    public static Node reverse(Node head) {
        if (head == null) {
            return head;
        }
        Node current = head;
        Stack<Node> stack = new Stack();
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        Node first = stack.pop();
        Node before = first;
        while (!stack.empty()) {
            Node next = stack.pop();
            next.next = null;
            before.next = next;

            before = next;
        }

        return first;
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Node head = new Node();
        head.data = 1;
        Node second = new Node();
        second.data = 2;
        head.next = second;

        printNode(reverse(head));
    }

    public static void printNode(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
