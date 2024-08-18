package com.ist_helper.pb.service;

import java.util.List;
import java.util.Optional;

import com.ist_helper.pb.repository.PBRepository;
import com.ist_helper.model.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Service
@EnableTransactionManagement
public class PBService {

	@Autowired
	private PBRepository pBRepository;

	public Optional<Book> getBookById(int id) {
		return pBRepository.findById(id);
	}

	public List<Book> findAllBooks() {
		return pBRepository.findAll();
	}

	@Transactional
	public Book addBook(Book book) {
		return pBRepository.save(book);
	}
}
