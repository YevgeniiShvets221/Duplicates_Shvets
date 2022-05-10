package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

        public static void main(String[] args) {
            int[] array = {1,5,3,6,2,9,33,21};
            int n = array.length;
            printDuplicates( array, n );
        }

        // function to find and print duplicates
        private static void printDuplicates(int[] arr, int n) {
            Map<Integer, Integer> map = new HashMap<>();
            int count = 0;
            boolean dup = false;
            for (int i = 0; i < n; i++) {
                if (map.containsKey( arr[i] )) {
                    count = map.get( arr[i] );
                    map.put( arr[i], count + 1 );
                } else {
                    map.put( arr[i], 1 );
                }
            }

            for (Entry<Integer, Integer> entry : map.entrySet()) {
                // if frequency is more than 1
                // print the element
                if (entry.getValue() > 1) {
                    System.out.print( "True! Duplicate is:"+ entry.getKey() + " " );
                    dup = true;
                }
            }
            // no duplicates present
            if (!dup) {
                System.out.println( "False! No duplicates in array!!!" );
            }
        }
}
