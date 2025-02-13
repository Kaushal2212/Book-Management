package com.example.rom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private UserRepository userRepository;

    public Book addBook(Book book, Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        book.setUser(user);
        return bookRepository.save(book);
    }

    public List<Book> getBooks(Long userId) {
        return bookRepository.findByUserId(userId);
    }

    public Book getBook(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

