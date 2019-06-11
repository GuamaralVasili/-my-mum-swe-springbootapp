package mum.swe.democrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.swe.democrud.model.Book;
import mum.swe.democrud.repository.BookRepository;
import mum.swe.democrud.service.BookService;

@Service("studentService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book save(Book student) {
		return bookRepository.save(student);
	}

	@Override
	public Book findOne(Long id) {
		return bookRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		bookRepository.delete(id);
	}

}
