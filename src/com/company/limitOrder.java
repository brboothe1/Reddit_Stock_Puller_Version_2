package com.company;

public class limitOrder implements Order {

    //UPDATE 2: Changed variable names to 'value' and slightly edited toString
    // Added Stock instantiation for composition

    private double value;
    private final Stock ticker;

    public limitOrder(Stock ticker, double value) {

        this.value = value;
        this.ticker = ticker;

    }

    public String toString(){

        return String.format("Setting limit order on %s for $%s.", ticker, value);

    }

}
