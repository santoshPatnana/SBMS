package com.ashokit.jpa.runner;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ashokit.jpa.entities.AuthorEntity;
import com.ashokit.jpa.entities.BookEntity;
import com.ashokit.jpa.repositories.BookEntityRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	@Autowired
	BookEntityRepository  bookRepo;

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		
		//*********** save books with authors *********************
		/*
		BookEntity  b1 = new BookEntity();
		b1.setBookId(1011);  b1.setBookName("Learn Spring");
		
		BookEntity b2 = new BookEntity();
		b2.setBookId(2022); b2.setBookName("Java Essentials");
		
		AuthorEntity a1 = new AuthorEntity();
		a1.setAuthorId(90101); a1.setAuthorName("Mike");
		
		AuthorEntity a2 = new AuthorEntity();
		a2.setAuthorId(90102); a2.setAuthorName("Allen");
		
		AuthorEntity a3 = new AuthorEntity();
		a3.setAuthorId(90103); a3.setAuthorName("Patric");
		
		Collection<AuthorEntity> b1Authors = new ArrayList<>();
		b1Authors.add(a1);  b1Authors.add(a2);
		
		Collection<AuthorEntity> b2Authors = new ArrayList<>();
		b2Authors.add(a1); b2Authors.add(a3);
		
		b1.setAuthors(b1Authors);
		b2.setAuthors(b2Authors);
		
		bookRepo.save(b1);
		bookRepo.save(b2);
		*/
		
		//******** fetch a book ********************
		BookEntity  bookEntity = bookRepo.findById(1011).get();
		Collection<AuthorEntity> bookAuthors = bookEntity.getAuthors();
		
		bookAuthors.forEach(a -> System.out.println(a.getAuthorName()));
		

	}

}
