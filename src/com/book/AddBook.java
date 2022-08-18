package com.book;

import java.util.ArrayList;
import java.util.Scanner;
import com.book.*;


public class AddBook{
	String bookId , bookTitle , bookAuthor , bookCategory ;
	float bookPrice;
	
	Scanner sc = new Scanner(System.in);
	char yes_no ;
	
	ArrayList<Book> books= new ArrayList<Book>();
	
	public AddBook() throws InvalidBookExceptions {
		do{
			System.out.print("Book Id : ");
			bookId = sc.nextLine();
			System.out.print("Book Title : ");
			bookTitle = sc.nextLine();
			System.out.print("Book Author : ");
			bookAuthor = sc.nextLine();
			System.out.print("Book Category : ");
			bookCategory = sc.nextLine();
			System.out.print("Book Price : ");
			bookPrice = sc.nextFloat();
			
			books.add( new Book(bookId , bookTitle , bookAuthor , bookCategory , bookPrice) );
			
			
			System.out.print("\n\nDo you want to add more Books ( Y / N ) : ");
			yes_no = sc.next().charAt(0);
			sc.nextLine();
			
		}while(yes_no == 'y' || yes_no == 'Y');
	}
	
	public void DisplayBooks() {
		for(Book book : books) {
			System.out.print(books.size());
			System.out.print("\n\nBook Id : " + book.bookId + "\nBook Title : " + book.bookTitle + "\nBook Author : " + book.bookAuthor + "\nBook Category : " + book.bookCategory + "\nBook Price : " + book.bookPrice);
		}
	}
	
	public void SearchByTitle() {
		String tit;
		System.out.print("Enter the Title for Search : ");
		tit = sc.nextLine();
		for(Book book : books) {
			if(book.bookTitle.equals(tit)) {
				System.out.print("\n\nBook Id : " + book.bookId + "\nBook Title : " + book.bookTitle + "\nBook Author : " + book.bookAuthor + "\nBook Category : " + book.bookCategory + "\nBook Price : " + book.bookPrice);
			}
		}
	}
	
	public void SearchByAuthor() {
		String aut;
		System.out.print("Enter the Author for Search : ");
		aut = sc.nextLine();
		for(Book book : books) {
			if(book.bookAuthor.equals(aut)) {
				System.out.print("\n\nBook Id : " + book.bookId + "\nBook Title : " + book.bookTitle + "\nBook Author : " + book.bookAuthor + "\nBook Category : " + book.bookCategory + "\nBook Price : " + book.bookPrice);
			}
		}
	}
	
}