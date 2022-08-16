package com.book;
import java.util.*;

public class Book{
	public String bookId , bookTitle , bookAuthor , bookCategory ;
	public float bookPrice;
	public Book( String bId , String bTitle , String bAuthor , String bCategory , float bPrice ) throws InvalidBookExceptions {
		
		if(bId.toLowerCase().charAt(0) == 'b' && bId.length() == 4) {
			this.bookId = bId;
			//System.out.println(bookId);
		}else {
			throw new InvalidBookExceptions("Invalid Book ID : It must start with 'B' or 'b' and must be of length 4 " );
		}
		
		this.bookTitle = bTitle;
		//System.out.println(bookTitle);
		
		this.bookAuthor = bAuthor;
		//System.out.println(bookAuthor);
		
		if( bCategory.toLowerCase().equals("science") || bCategory.toLowerCase().equals("fiction") || bCategory.toLowerCase().equals("technology") || bCategory.toLowerCase().equals("others") ) {
			this.bookCategory = bCategory;
			//System.out.println(bookCategory);
		}else {
			throw new InvalidBookExceptions("Invalid Book Category : Category must be 'science' , 'fiction' , 'technology' or 'others' " );
		}
		
		if(bPrice < 0) {
			throw new InvalidBookExceptions("Invalid Book Price : Price can't be in negative.");
		}else {
			this.bookPrice = bPrice;
			//System.out.println(bookPrice);
		}
		
		
		
	}
	
}