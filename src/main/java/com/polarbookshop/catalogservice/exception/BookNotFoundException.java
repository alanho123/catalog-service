package com.polarbookshop.catalogservice.exception;

/**
 * @author : Jason Ho
 * @since : 2023/9/28
 */
public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }
}
