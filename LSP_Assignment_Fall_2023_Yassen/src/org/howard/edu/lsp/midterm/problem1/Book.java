package org.howard.edu.lsp.midterm.problem1;

public class Book {
	//Creating the class attributes
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //Overriding the equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book otherBook = (Book) obj;
        return title.equals(otherBook.title) && author.equals(otherBook.author);
    }

   //Overriding the toString method
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}

