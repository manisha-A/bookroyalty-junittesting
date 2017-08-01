package com.manisha.junit;

/**
 * Created by manishaawasthi on 25/07/2017.
 */
public class BookRoyalty {

    public double calculateRoyalty(BookDetails bookdetails){
        double royalty = 0.0;
        if(bookdetails.getPrice() < 2.11){
            royalty = bookdetails.getPrice() * 0.4;
        }
        else{
            royalty = bookdetails.getPrice() * 0.6;
        }
        return Double.parseDouble(String.format("%.3f",royalty));
    }
}
