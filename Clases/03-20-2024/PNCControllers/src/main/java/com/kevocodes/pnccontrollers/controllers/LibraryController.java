package com.kevocodes.pnccontrollers.controllers;

import com.kevocodes.pnccontrollers.domain.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/library")
public class LibraryController {
    private static final List<Book> books = Arrays.asList(
            new Book("0261102303", "Lord of the Rings"),
            new Book("0007441428", "Game of Thrones"),
            new Book("0747581088", "Harry Potter and the Half-Blood Prince"),
            new Book("1401248195", "Watchmen"),
            new Book("030788743X", "Ready player one"),
            new Book("843760494X", "Cien Años de Soledad"),
            new Book("0553804367", "A Briefer History of Time")
    );

    @GetMapping("/all")
    public String getAllBooks(Model model) {
        //Model permite crear el modelo y se modifica por referencia
        model.addAttribute("books", books);

        return "book-list";
    }

}
