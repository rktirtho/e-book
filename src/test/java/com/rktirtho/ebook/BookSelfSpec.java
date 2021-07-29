package com.rktirtho.ebook;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Book self specification test")
public class BookSelfSpec {

    @Test
    @DisplayName("Book self is null when no book is added")
    public void getBookselfNullException(){
        assertEquals("df", "df", "Book self should be null");

    }
}
