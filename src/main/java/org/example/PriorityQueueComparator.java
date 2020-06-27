package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Class to show how to use a custom integer comparator in a priority queue
 */
public class PriorityQueueComparator {

    public static void main(String[] args) {
        testIntegersCustomOrdering();
    }

    /**
     * Function which shows How we can use Comparator in a Priority Queue to get custom Ordering
     */
    private static void testIntegersCustomOrdering() {
        Queue<Integer> testIntegersPQ = new PriorityQueue<>(new CustomIntegerComparator());
        testIntegersPQ.add(11);
        testIntegersPQ.add(5);
        testIntegersPQ.add(-1);
        testIntegersPQ.add(12);
        testIntegersPQ.add(6);

        System.out.println("Integers stored in reverse order of priority in a Priority Queue\n");
        while (!testIntegersPQ.isEmpty()) {
            System.out.println(testIntegersPQ.poll());
        }
    }

    /**
     * Class to implement Custom Comparator for an Integer
     */
    static class CustomIntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? 1 : -1;
        }
    }
}
