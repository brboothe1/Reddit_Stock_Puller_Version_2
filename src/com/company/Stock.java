package com.company;

public class Stock {

    //UPDATE 2: Removed the limitOrder and marketOrder variables from Stock and edited toString

    private final String ticker;
    private final String companyName;

    public Stock(String ticker, String companyName) {

        this.ticker = ticker;
        this.companyName = companyName;
    }

    public String toString() {return String.format ("%s (%s)" , ticker, companyName);

    }


}
