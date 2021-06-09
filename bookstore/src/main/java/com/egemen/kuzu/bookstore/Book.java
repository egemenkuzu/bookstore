package com.egemen.kuzu.bookstore;

public class Book {

	// constructor using fields
	public Book(int id, String title, String author,String summary)   
	{  
	super();
	this.id = id;  
	this.title=title;
	this.author=author;
	this.summmary=summary;
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

	public String getSummmary() {
		return summmary;
	}

	public void setSummmary(String summmary) {
		this.summmary = summmary;
	}

	public int id;
	public String title;
	public String author;
	public String summmary;

}
