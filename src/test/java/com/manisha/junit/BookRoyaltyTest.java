package com.manisha.junit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manishaawasthi on 25/07/2017.
 */
public class BookRoyaltyTest {

    @Test
    public void calculateBookRoyaltyForBooksFallingUnderSixtyPercentRoyalty() {
        BookDetails bookdetail = new BookDetails();
        BookRoyalty bookroyalty = new BookRoyalty();

        bookdetail.setAuthor("James Whittaker");
        bookdetail.setTitle("How Google Tests Software");
        bookdetail.setPrice(2.12);

        assertEquals(1.272,bookroyalty.calculateRoyalty(bookdetail),0.0);
    }

    @Test
    public void calculateBookRoyaltyForBooksFallingUnderFortyPercentRoyalty() {
        BookDetails bookdetail = new BookDetails();
        BookRoyalty bookroyalty = new BookRoyalty();

        bookdetail.setAuthor("Manisha Awasthi");
        bookdetail.setTitle("How To Be An Awesome Tester");
        bookdetail.setPrice(2.02);

        assertEquals(0.808,bookroyalty.calculateRoyalty(bookdetail),0.0);
    }

    @Test
    public void calculateBookRoyaltyForBooksPricedTwoDotOneOne() {
        BookDetails bookdetail = new BookDetails();
        BookRoyalty bookroyalty = new BookRoyalty();

        bookdetail.setAuthor("Philip B. Crosby");
        bookdetail.setTitle("Quality is Free");
        bookdetail.setPrice(2.11);

        assertEquals(1.266,bookroyalty.calculateRoyalty(bookdetail),0.0);
    }
}
