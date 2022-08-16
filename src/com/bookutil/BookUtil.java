package com.bookutil;

import com.book.*;

import java.util.*;

public class BookUtil{
	public static void main(String[] args) throws InvalidBookExceptions {
		
		int operation;
		char yes_no_1 = 'y';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*  *  *  WelCome To Book Shop *  *  *");
		System.out.print("\n Default Adding a Book \n");
		
		AddBook b = new AddBook();
		
		while(yes_no_1 == 'y' || yes_no_1 == 'Y'){
			System.out.println("1. Add New Book ");
			System.out.println("2. Search By Title");
			System.out.println("3. Search By Author");
			System.out.println("4. Display All Book");
			
			System.out.print("Choose the Operation : ");
			operation = sc.nextInt();
			
			
			switch(operation) {
			case 1 :
				new AddBook();
			
				break;
				
			case 2 : 
				b.SearchByTitle();
				
				break;
				
			case 3 : 
				b.SearchByAuthor();
				
				break;
				
			case 4 : 
				b.DisplayBooks();
				
				break;
				
			default : 
				System.out.print("Invalid Operation...");
				break;			
			}
			System.out.print("\n\nDo you want to go to Menu : ");
			yes_no_1 = sc.next().charAt(0);
			
		}while(yes_no_1 == 'y' || yes_no_1 == 'Y');
		System.out.print("Exiting...");
		
	}
}