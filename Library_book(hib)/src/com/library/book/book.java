package com.library.book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="library")
public class book {
	@Id
	int id;
	String title;
	String author;
	int publicationyear;
	int isbn;
	public book() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublicationyear() {
		return publicationyear;
	}
	public void setPublicationyear(int publicationyear) {
		this.publicationyear = publicationyear;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "book [id=" + id + ", title=" + title + ", author=" + author + ", publicationyear=" + publicationyear
				+ ", isbn=" + isbn + "]";
	}
	
	

}
