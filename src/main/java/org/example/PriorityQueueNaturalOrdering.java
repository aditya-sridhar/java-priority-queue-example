package org.example;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Class to demonstrate how Priority Queue Stores data in Natural Ordering
 */
public class PriorityQueueNaturalOrdering {

    public static void main(String[] args) {
        testStringsNaturalOrdering();
    }

    /**
     * Function which shows how a Priority queue Stores data in Natural Ordering
     */
    private static void testStringsNaturalOrdering() {
        Queue<String> testStringsPQ = new PriorityQueue<>();
        testStringsPQ.add("abcd");
        testStringsPQ.add("1234");
        testStringsPQ.add("23bc");
        testStringsPQ.add("zzxx");
        testStringsPQ.add("abxy");

        System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
        while (!testStringsPQ.isEmpty()) {
            System.out.println(testStringsPQ.poll());
        }
    }


}
