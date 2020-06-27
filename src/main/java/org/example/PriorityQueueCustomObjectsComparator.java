package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Class to show how custom objects are stored in a priority queue
 */
public class PriorityQueueCustomObjectsComparator {

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
        Queue<CustomerOrder> customerOrders = new PriorityQueue<>(new CustomerOrderComparator());
        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);
        while (!customerOrders.isEmpty()) {
            System.out.println(customerOrders.poll());
        }
    }

    /**
     * Class to implement a comparator for CustomerOrder to store in descending order of order amount
     */
    static class CustomerOrderComparator implements Comparator<CustomerOrder> {

        @Override
        public int compare(CustomerOrder o1, CustomerOrder o2)
        {
            return o1.getOrderAmount() < o2.getOrderAmount() ? 1 : -1;
        }
    }
}
