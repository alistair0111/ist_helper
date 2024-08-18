package com.ist_helper.pb.controller;

import java.util.List;
import java.util.Optional;

import com.ist_helper.model.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ist_helper.pb.service.PBService;

@RestController
@RequestMapping("/book")
public class PBController {

	@Autowired
	private PBService pBService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Book> findBookById(@PathVariable int id) {
		return pBService.getBookById(id);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Book> allBooks() {
		return pBService.findAllBooks();
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Book addBook(@RequestBody Book book) {
		return pBService.addBook(book);
	}
}
