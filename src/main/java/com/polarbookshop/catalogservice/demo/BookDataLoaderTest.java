package com.polarbookshop.catalogservice.demo;

import com.polarbookshop.catalogservice.domain.Book;
import com.polarbookshop.catalogservice.domain.BookRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author : Jason Ho
 * @since : 2023/10/4
 */
@Component
@ConditionalOnProperty(name = "polar.test", havingValue = "true")
public class BookDataLoaderTest {
    private final BookRepository bookRepository;

    public BookDataLoaderTest(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initTestData() {
        var book1 = Book.of("9876543210", "BookDataLoaderTest", "tester", 11.11);
        bookRepository.save(book1);
    }
}
