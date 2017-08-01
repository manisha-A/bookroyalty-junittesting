package com.manisha.junit;

/**
 * Created by manishaawasthi on 25/07/2017.
 */
public class BookDetails {
    private String title;
    private String author;
    private double price;

    /**
     *
     * @return book title
     */
    public String getTitle(){
        return title;
    }

    /**
     *
     * @param title to be set
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     *
     * @return book author
     */
    public String getAuthor(){
        return author;
    }

    /**
     *
     * @param author to be set
     */
    public void setAuthor(String author){
        this.author = author;
    }

    /**
     *
     * @return book price
     */
    public double getPrice(){
        return price;
    }

    /**
     *
     * @param price to be set
     */
    public void setPrice(double price){
        this.price = price;
    }

}
