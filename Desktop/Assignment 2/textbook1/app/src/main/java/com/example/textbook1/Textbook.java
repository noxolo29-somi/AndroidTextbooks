package com.example.textbook1;

import java.util.Objects;

public class Textbook {

    private String title;
    private String author;
    private String price;
    private String sellerName;
    private int numberOfCopies;
    private int bankingInfo;


    public Textbook(String title, String author, String price, String sellerName, int numberOfCopies, int bankingInfo) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.sellerName = sellerName;
        this.numberOfCopies = numberOfCopies;
        this.bankingInfo = bankingInfo;
    }

    // Getters and Setters

    public int getBankingInfo() {
        return bankingInfo;
    }
    public void setBankingInfo(int bankingInfo) {
        this.bankingInfo = bankingInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    // Override equals and hashCode to prevent duplicates based on title and author
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Textbook textbook = (Textbook) o;
        return Objects.equals(title, textbook.title) &&
                Objects.equals(author, textbook.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
