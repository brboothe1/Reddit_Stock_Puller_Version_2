package com.company;

public class Main {

    public static void main(String[] args) {

        //UPDATE 2: Corrected composition so that the orders pull in the stock instead of the stock pulling the order.
        // Completed with use of improved marketOrder and limitOrder instantiation.

        Stock GME = new Stock("GME", "Gamestop");

        marketOrder gmeMarkerOrder = new marketOrder(GME);
        limitOrder gmeLimitOrder = new limitOrder(GME, 92.24);

        System.out.println(gmeMarkerOrder);
        System.out.println(gmeLimitOrder);
    }
}
