package com.polarbookshop.catalogservice.exception;

/**
 * @author : Jason Ho
 * @since : 2023/9/28
 */
public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }
}
