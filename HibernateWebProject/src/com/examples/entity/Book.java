package com.examples.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="books")
public class Book {
@Id
private int bookId;
private String bookTitle;
private String bookAuthor;
private float bookPrice;
private Date datePub;
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public float getBookPrice() {
	return bookPrice;
}
public void setBookPrice(float bookPrice) {
	this.bookPrice = bookPrice;
}
public Date getDatePub() {
	return datePub;
}
public void setDatePub(Date datePub) {
	this.datePub = datePub;
}
}
