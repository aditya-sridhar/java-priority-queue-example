package org.example;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Class to show how custom objects are stored in a priority queue
 */
public class PriorityQueueCustomObjects {

    public static void main(String[] args) {
        testPriorityQueueCustomObjects();
    }

    /**
     * Function to show how a priority queue works with Custom Objects
     */
    private static void testPriorityQueueCustomObjects() {
        CustomerOrder c1 = new CustomerOrder(1, 100.0, "customer1");
        CustomerOrder c2 = new CustomerOrder(3, 50.0, "customer3");
        CustomerOrder c3 = new CustomerOrder(2, 300.0, "customer2");

        Queue<CustomerOrder> customerOrders = new PriorityQueue<>();
        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);
        while (!customerOrders.isEmpty()) {
            System.out.println(customerOrders.poll());
        }
    }
}
