package com.egemen.kuzu.bookstore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service  
public class ProductService implements IProductService{
	
	
	public static ArrayList<Book> books=null;
	@Override  
	public List<Book> findAll()  
	{  
		books = new ArrayList<Book>();		
		
		books.add(new Book(1,"1984","George Orwell","Authoritative  management of England"));
		books.add(new Book(2,"Animal Farm","George Orwell","Rebelllion of animals in a farm"));
		books.add(new Book(3,"Fundamentals of Physics","Silverman","Modern University Physics"));

		System.out.println("Book List");
		for(int i= 0; i<books.size();i++) {
			System.out.print(" ID: "+ books.get(i).id + " TITLE: " +books.get(i).title + " SUMMARY: "+ books.get(i).summmary + "author: " +books.get(i).author) ;
			System.out.println("------------------------------------------------------------------------------------------");
		}
		return books;
	}
	

	@Override
	public void deleteBook(int bookId) {


		Book foundedBook=null;
		
		for(Book b : books){
			  if(b.id == bookId){
			     foundedBook = b;
			     break;
			  }
			}
			if(foundedBook != null){
				books.remove(bookId);
				System.out.println("deleted book: " +" id "+ foundedBook.id + " title: " +foundedBook.title + " summary: "+ foundedBook.summmary +" author: " + foundedBook.author);
			}
			else{
				System.out.println("There is no book with id :" + bookId);
			}
		
	}

	@Override
	public Book addBook(Book book) {
		System.out.println("Added book: " +" id "+ book.id + " title: " +book.title + " summary: "+ book.summmary +" author: " + book.author);
			
		return book;
	}
	
	
    
	
	
	
  

	
	
	
}
