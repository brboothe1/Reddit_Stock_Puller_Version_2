package com.company;

public class Stock {

    //UPDATE 2: Removed the limitOrder and marketOrder variables from Stock and edited toString

    private final String ticker;
    private final String companyName;

    public Stock(String ticker, String companyName) {

        this.ticker = ticker;
        this.companyName = companyName;
    }

    public String toString() {return String.format ("This is the stock for the company %s. The ticker is %s." , companyName, ticker);

    }


}
