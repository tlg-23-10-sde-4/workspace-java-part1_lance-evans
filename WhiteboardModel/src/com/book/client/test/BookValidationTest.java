package com.book.client.test;

import com.book.Book;
import com.book.Genre;

import java.util.Set;

class BookValidationTest {
    public static void main(String[] args) {

        Book book = new Book();

        book.setPages(0);
        book.setGenres(Set.of(Genre.FANTASY_FICTION, Genre.ROMANCE));
        System.out.println(book);

        book.setPages(500);
        book.setPagesAlreadyRead(-15);
        System.out.println(book);
        book.setPagesAlreadyRead(15);
        System.out.println(book);
    }
}