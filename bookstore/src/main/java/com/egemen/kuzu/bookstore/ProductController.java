package com.egemen.kuzu.bookstore;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class ProductController {
	@Autowired
	private IProductService productService;

	
	
	//kitaplari listemelek için url http://localhost:8080/bookList
	@GetMapping(value = "/bookList")
	public List<Book> getProduct() {
		List<Book> products = productService.findAll();
		System.out.println("booklist API call....");
		
		return products;
	}
	//kitap silmek için url. Kitap id=1 icin  http://localhost:8080/bookDelete/1
	@DeleteMapping("/bookDelete/{id}")  
	public ResponseEntity<Book> delete(@PathVariable int id) {
		System.out.println("book delete API called.....");
    	productService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
	
	@PostMapping("/addBook")
	public ResponseEntity<Object> createStudent(@RequestBody Book book) {
	
		System.out.println("book add API called.....");
		Book addedBook =productService.addBook(book); 
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(addedBook.getId()).toUri();
		return ResponseEntity.created(location).build();
		
		
		
		
		/*
		 * 
		 * 
		 *       {
    				"id": "4",
    				"title": "Sefiller"
    				"author": "Victor Hugo",
    				"summary": "Sefil bir yasam"
				}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
	}
	
	
}