package com.ashokit.jpa.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKS")
public class BookEntity {
	@Id
	private Integer bookId;
	
	@Column(length = 25)
	private String bookName;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable( name = "BOOKS_AUTHORS", 
	            joinColumns = @JoinColumn(name="BOOK_ID_FK"),
	            inverseJoinColumns = @JoinColumn(name="AUTHOR_ID_FK")
	          )
	private Collection<AuthorEntity> authors;


	public Integer getBookId() {
		return bookId;
	}


	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public Collection<AuthorEntity> getAuthors() {
		return authors;
	}


	public void setAuthors(Collection<AuthorEntity> authors) {
		this.authors = authors;
	}
	
	
	

}
