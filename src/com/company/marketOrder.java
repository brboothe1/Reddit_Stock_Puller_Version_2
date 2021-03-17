package com.company;

//UPDATE 2: Removed user input for Marker Orders and built framework for correctly finding the Market Order
// Added Stock instantiation for composition

public class marketOrder implements Order {

    private final Stock ticker;

    public marketOrder(Stock ticker) {

        this.ticker = ticker;


        // double value = (web scraper logic for finding the current market order price)


    }

    public String toString(){
        return String.format("Executing market order on %s." , ticker);
    }


}
