package com.company;

public class limitOrder implements Order {

    //UPDATE 2: Changed variable names to 'value' and slightly edited toString
    // Added Stock instantiation for composition

    double value;
    final Stock ticker;

    public limitOrder(Stock ticker, double value) {

        this.value = value;
        this.ticker = ticker;

    }

    public String toString(){

        return String.format("The Limit Order value is set at %s.", value);

    }

}
