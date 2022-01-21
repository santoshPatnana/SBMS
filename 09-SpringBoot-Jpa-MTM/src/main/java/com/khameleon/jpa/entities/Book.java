package com.khameleon.jpa.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="BOOK")
public class Book {
	@Id
	Integer bookId;
	
	@Column(length=25)
	String bookName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="BOOKS_AUTHORS", joinColumns = @JoinColumn(name="BOOK_ID_FK"),
	inverseJoinColumns=@JoinColumn(name="AUTHOR_ID_FK"))
	Collection<Author> authors;

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

	public Collection<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Collection<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authors=" + authors + "]";
	}
	
	

}
