package com.egemen.kuzu.bookstore;

import java.util.List;

public interface IProductService {

	List<Book> findAll();  
	
	void deleteBook(int id);
	
	Book addBook(Book book);
}
