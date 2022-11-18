package pl.workshop.service;

import pl.workshop.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getBooks();

  void update(Book book);
   void add(Book book);
   void delete(Long id);
    Optional<Book> get(Long id);
}
