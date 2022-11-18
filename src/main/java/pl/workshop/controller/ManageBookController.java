package pl.workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.workshop.model.Book;
import pl.workshop.service.BookService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin/books")
public class ManageBookController {
    private final BookService bookService;

    public ManageBookController(BookService bookService) {

        this.bookService = bookService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String showBooks(Model model) {
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "/books-list";
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String showBook(Model model, @PathVariable long id) {
        Optional<Book> book = bookService.get(id);
        model.addAttribute("book", book.get());
//        model.addAttribute("book", bookService.get(id).orElseThrow(EntityNotFoundException::new));
        return "book-details";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("book", new Book());
        return "/book-form";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String submit(@Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "book-form";
        }
        bookService.add(book);
        return "redirect:/admin/books";
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Long id) {
        bookService.delete(id);
        return "redirect:/admin/books";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String formUpdate(@PathVariable long id, Model model) {
        model.addAttribute("book", bookService.get(id));
        return "/book-edit-form";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String formUpdate(@Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "book-edit-form";
        }
        bookService.update(book);
        return "redirect:/admin/books";
    }

}
