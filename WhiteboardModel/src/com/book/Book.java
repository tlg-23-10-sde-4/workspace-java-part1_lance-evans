package com.book;

import java.util.HashSet;
import java.util.Set;

public class Book {
    // attributes/properties
    private String title;
    private String author;
    private int pages;
    private boolean isGoodRead;
    private int pagesAlreadyRead;
    public Set<Genre> genres = new HashSet<>();
    // TODO add date generator for date and time last read

    //Constructor
    public Book(){}
    public Book(String title, String author){
        setTitle(title);
        setAuthor(author);
    }
    public Book(String title, String author, int pages, boolean isGoodRead) {
        this(title, author);
        setPages(pages);
        setGoodRead(isGoodRead);
    }
    public Book(String title, String author, int pages, boolean isGoodRead, int pagesAlreadyRead){
        this(title,  author, pages, isGoodRead);
        setPagesAlreadyRead(pagesAlreadyRead);
    }
    public Book(String title, String author, int pages, boolean isGoodRead, int pagesAlreadyRead, Set<Genre> genres) {
        this(title, author, pages, isGoodRead, pagesAlreadyRead);
        setGenres(genres);
    }

    // Getters/Setters for each of the private fields
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

    public boolean isGoodRead() {
        return isGoodRead;
    }

    public void setGoodRead(boolean goodRead) {
        isGoodRead = goodRead;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0){
            this.pages = pages;
        }
        else {
            System.out.println("There needs to be a positive number of pages. " + pages + " is not a valid number for pages.");
        }

    }

    public int getPagesAlreadyRead() {
        return pagesAlreadyRead;
    }

    public void setPagesAlreadyRead(int pagesAlreadyRead) {
        if (pagesAlreadyRead > 0){
            this.pagesAlreadyRead = pagesAlreadyRead;}

        else {
            System.out.println("Error: If you have not read any pages of the book, please don't input anything.");
        }
    }

    public Set <Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    // Function to track progress of book reading
    public String readBook(int numPagesRead){
        if (numPagesRead > 0) {
            pagesAlreadyRead = pagesAlreadyRead + numPagesRead;
            return "Congratulations, you have read " + pagesAlreadyRead + "/" + getPages() + " pages. Only " +
                    (getPages() - pagesAlreadyRead) + " pages remaining.";
        }
        else {
            return "Error: Invalid number of pages read. Have you progressed in the book?";
        }
    }

    // If/else based on the boolean "isGoodRead" determine if you should read the book
    public String shouldRead(){
        if (isGoodRead()){
            return getTitle() + " appears to be a good " + getGenres() + " book by " + getAuthor() + ".";
        }
        else{
            return getTitle() + " appears to be a poor book, I do not recommend reading this book.";
        }
    }
    // If/else based on the boolean "isGoodRead" that determines time to read the book
    public String timeToRead() {
        if (isGoodRead()) {
            if (getPages() > 0){
                double time = getPages() / 60;
                long roundedTime = Math.round(time);
                return "It will take approximately " + roundedTime + " hours to complete " + getTitle() + ".";
            }
            else{
                return "Time to read is unknown for " + getTitle() + ".";
            }

        }
        else
            return "It doesn't matter, I won't be reading " + getTitle() + ".";
    }
    // Overriding default "toString" method
    public String toString(){
        return "com.book.Book: title= " + getTitle() + "; pages= " + getPages() + "; pagesAlreadyRead=  " + getPagesAlreadyRead()
                + "; author= " + getAuthor() + "; genre= " + getGenres() + "; isGoodRead= " + isGoodRead();
    }
}