package us.zachandes.first.Web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @RequestMapping("/books")
    public List<Book> getAllBooks(){

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Wheel of Time", "Robert Jordan"));
        books.add(new Book("The Sword of Truth", "Terry Goodkind"));
        books.add(new Book("Mistborn", "Brandon Sanderson"));
        books.add(new Book("Dune", "Frank Herbert"));

        return books;
    }

}
