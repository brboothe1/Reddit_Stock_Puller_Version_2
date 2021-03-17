package com.company;

public class Main {

    public static void main(String[] args) {

        //UPDATE 2: Corrected composition so that the orders pull in the stock instead of the stock pulling the order.
        // Completed with use of improved marketOrder and limitOrder instantiation.

        Stock GME = new Stock("GME", "GameStop");

        marketOrder GMEMarketOrder = new marketOrder(GME);
        limitOrder GMELimitOrder = new limitOrder(GME, 92.24);

        System.out.println(GMEMarketOrder);
        System.out.println(GMELimitOrder);

        Stock BB = new Stock("BB", "BlackBerry");

        marketOrder BBMarketOrder = new marketOrder(BB);
        limitOrder BBLimitOrder = new limitOrder(BB, 15.53);

        System.out.println(BBMarketOrder);
        System.out.println(BBLimitOrder);
    }
}
