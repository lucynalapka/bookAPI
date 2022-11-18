package pl.workshop.service;

import pl.workshop.service.BookService;
import org.springframework.stereotype.Component;
import pl.workshop.model.Book;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class MockBookService implements BookService {
    private List<Book> books;
    private static Long nextId = 4L;



    public MockBookService() {
        books = new ArrayList<>();
        books.add(new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming"));
        books.add(new Book(2L, "8568324631333", "Thinking in Almonds",
                "T.J. Brooks", "Helion", "recipes"));
        books.add(new Book(3L, "4256324631321", "Poisonous flowers",
                "R Plant", "Helion", "plants"));
    }


    public Optional<Book> get(Long id){

        return books.stream()
                .filter(i->i.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    public void update(Book book){
        int id =books.indexOf(book.getId());
        books.set(id, book);
    }

    public void add(Book book){
        book.setId(nextId++);
        books.add(book);
    }
    public void delete(Long id) {
        if (get(id).isPresent()) {
            books.remove(get(id).get());
        }
    }


}
