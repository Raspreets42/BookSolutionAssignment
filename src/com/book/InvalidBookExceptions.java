package com.book;

public class InvalidBookExceptions extends Exception{
	public InvalidBookExceptions(String errorMessage) {
		super(errorMessage);
	}
}