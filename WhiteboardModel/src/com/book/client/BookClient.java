package com.book.client;

import com.book.Book;
import com.book.Genre;

class BookClient {
    public static void main(String[] args) {

        // creating an object/instance variable
        Book b1 = new Book();
        b1.setTitle("Deadly Education");
        b1.setAuthor("Naomi Novik");
        b1.genres.add(Genre.EPIC_FANTASY);
        b1.genres.add(Genre.MAGIC_SCHOOL_FANTASY);
        b1.genres.add(Genre.ADULT_FANTASY);
        b1.genres.add(Genre.HORROR);
        b1.setPages(388);
        b1.setGoodRead(true);

        // creating an object/instance variable
        Book b2 = new Book();
        b2.setTitle("Fourth Wing");
        b2.setAuthor("Rebecca Yarros");
        b2.genres.add(Genre.FANTASY_FICTION);
        b2.genres.add(Genre.ROMANCE);
        b2.genres.add(Genre.HIGH_FANTASY);
        b2.setPages(498);
        b2.setGoodRead(true);

        // creating an object/instance variable
        Book b3 = new Book();
        b3.setTitle("Twilight");
        b3.genres.add(Genre.YOUNG_ADULT);
        b3.genres.add(Genre.FANTASY_FICTION);
        b3.genres.add(Genre.ROMANCE);
        b3.genres.add(Genre.VAMPIRE);
        b3.setAuthor("Stephanie Meyer");
        b3.setPages(498);
        b3.setGoodRead(false);

        // Create object instance variable with constructor
        Book book4 = new Book("The Golden Enclaves", "Naomi Novik", 407, true);
        book4.genres.add(Genre.SCIENCE_FICTION);
        book4.genres.add(Genre.HIGH_FANTASY);
        System.out.println(book4);

        // Calling the toString()
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        // Calling different functions
        System.out.println(b1.shouldRead());
        System.out.println(b3.timeToRead());
        System.out.println(b2.shouldRead());
        System.out.println(b2.timeToRead());
        b1.readBook(15);
        System.out.println(b1.readBook(21));
    }
}
