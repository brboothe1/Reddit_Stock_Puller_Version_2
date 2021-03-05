package com.company;

//UPDATE 2: Removed user input for Marker Orders and built framework for correctly finding the Market Order
// Added Stock instantiation for composition

public class marketOrder implements Order {

    Stock ticker;

    public marketOrder(Stock ticker) {

        this.ticker = ticker;


        // double value = (web scraper logic for finding the current market order price)

        // System.out.println("The current Market Order value is " + value);

    }


}
