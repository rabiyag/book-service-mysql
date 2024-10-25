package com.springbootmysql.books.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootmysql.books.models.Book;
import com.springbootmysql.books.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book); 
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book updateBook(Long id, Book bookDetails) {
        return bookRepository.findById(id).map(
            
        book -> {
            book.setAuthor(bookDetails.getAuthor());
            book.setTitle(bookDetails.getTitle());
            book.setPublishedDate(bookDetails.getPublishedDate());
            return bookRepository.save(book);
        }).orElseGet(()-> 
        {
            bookDetails.setId(id);
            return bookRepository.save(bookDetails);
        });
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

}
