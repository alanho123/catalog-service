package com.polarbookshop.catalogservice.domain;

import java.util.Optional;

/**
 * @author : Jason Ho
 * @since : 2023/9/28
 */
public interface MemoryBookRepository {
    Iterable<Book> findAll();

    Optional<Book> findByIsbn(String isbn);

    boolean existsByIsbn(String isbn);

    Book save(Book book);

    void deleteByIsbn(String isbn);
}
