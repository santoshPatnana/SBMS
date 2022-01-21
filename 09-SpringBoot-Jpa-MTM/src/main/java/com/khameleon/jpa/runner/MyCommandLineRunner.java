package com.khameleon.jpa.runner;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.khameleon.jpa.dao.BookRepository;
import com.khameleon.jpa.entities.Author;
import com.khameleon.jpa.entities.Book;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Author auth1 = new Author();
		auth1.setAuthorId(101);
		auth1.setAuthorName("Santosh");
		
		Author auth2 = new Author();
		auth2.setAuthorId(102);
		auth2.setAuthorName("Kumar");
		
		Author auth3 = new Author();
		auth3.setAuthorId(103);
		auth3.setAuthorName("Patnana");
		
		Collection<Author> authors1 = new ArrayList<>();
		authors1.add(auth1);
		authors1.add(auth2);
		
		Collection<Author> authors2 = new ArrayList<>();
		authors2.add(auth1);
		authors2.add(auth3);
		
		Book book1 = new Book();
		book1.setBookId(901);
		book1.setBookName("Java essentials");
		book1.setAuthors(authors1);
		
		Book book2 = new Book();
		book2.setBookId(902);
		book2.setBookName("Oracle");
		book2.setAuthors(authors2);
		
		repo.save(book1);
		repo.save(book2);
		

	}

}
