package com.book.client;

import com.book.Book;
import com.book.Genre;
import java.util.*;

class BookClientArgs {
    public static void main(String[] args) {
        StringBuilder concatenatedGenres = new StringBuilder();
        String[] arrayOfConcatenatedGenres;
        int arrayLength = args.length;
        // Verifies valid length of array and prints statements if not
        if (arrayLength < 5) {
            String howToUse = "Usage: <title> <author> <pages> <true/false(isGoodRead)>" +
                    " <pagesAlreadyRead> <genre/genres> \n";
            String bookExample = "Example: java com.book.client.BookClientArgs \"A Deadly Education\" " +
                    "\"Naomi Novik\" 355 true 15 fantasy_fiction narrative novel science_fiction\n";
            String note1 = "Note: Supported genres are " + Arrays.toString(Genre.values()) + ".\n";
            String note2 = "Note2: With the title, use quotes around the full title e.g., \"this is the title.\"\n";
            String note3 = "Note3: With the author, use quotes around the full name. e.g., \"first last.\"\n";
            System.out.println(howToUse + bookExample + note1 + note2 + note3);
        }
        // The bulk of the operations
        else {
            // Assigning variable based on arg positions
            String title = args[0];
            String author = args[1];
            int pages = Integer.parseInt(args[2]);
            boolean isGoodRead = Boolean.parseBoolean(args[3]);
            int pagesAlreadyRead = Integer.parseInt(args[4]);

            // Creating new instance of Book
            Book clientBook = new Book(title, author, pages, isGoodRead);
            //pulling the genres out of the args array and placing them into a StringBuilder
            int start = 5;
            int endIndex = arrayLength - 1;
            for (int i = start; i <= endIndex; i++) {
                concatenatedGenres.append(args[i]);
                if (i < endIndex) {
                    concatenatedGenres.append(" ");
                }
            }
            // converting StringBuilder of genres to array
            arrayOfConcatenatedGenres = concatenatedGenres.toString().split(" ");
            // Adding genres to the set using a foreach loop
            for (String arrayOfConcatenatedGenre : arrayOfConcatenatedGenres) {
                clientBook.genres.add(Genre.valueOf(arrayOfConcatenatedGenre.toUpperCase(Locale.ROOT)));
            }
            // formatted print statement to give information about the book
            System.out.printf("You have selected %s, which has %s pages. \nMy recommendation on reading this is book is " +
                            "that %s \n%s \n%s \n", title, pages, clientBook.shouldRead(), clientBook.timeToRead(),
                    clientBook.readBook(pagesAlreadyRead));
        }
    }
}