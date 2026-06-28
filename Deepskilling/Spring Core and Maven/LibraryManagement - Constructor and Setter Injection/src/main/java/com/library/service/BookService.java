package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String libraryName;

    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void display() {
        System.out.println("Library Name : " + libraryName);
        bookRepository.saveBook();
    }
}