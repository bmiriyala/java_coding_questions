package com.babu.common.questions;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsToGroupArrayElement {

    public static void main(String[] args) {
        int[] array = { 1,0,1,0,1 };
        int numberOfSwipes = minimumSwaps(array, 5);
        System.out.println("numberOfSwipes" + numberOfSwipes);
    }

    public static int minimumSwaps(int[] a, int n) {
        HashMap<Integer, Integer>  m = new HashMap <Integer, Integer>();
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = a[i];
        }
        Arrays.sort(copy);
        for (int i = 0; i < n; i++) {
            m.put(copy[i], i + 1);
        }
        int moves = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) != (int) m.get(a[i])) {
                int temp = a[i];
                int pos = m.get(a[i]) - 1;
                a[i] = a[pos];
                a[pos] = temp;
                moves++;
            }
        }
        Arrays.stream(a).forEach(System.out::println);
        return moves;
    }
}
