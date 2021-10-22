/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        4
*/

// 2021-09-10

public class Book extends Item {
  private int isbn_number;
  private String author;

  public Book() {
    super();
    isbn_number = 0;
    author = "";
  }

  public Book(String title, String author, int isbn_number) {
    super(title);
    this.author = author;
    this.isbn_number = isbn_number;
  }

  public int getIsbnNumber() {
    return isbn_number;
  }

  public String getAuthor() {
    return author;
  }

  public void setIsbnNumber(int isbn_number) {
    this.isbn_number = isbn_number;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getListing() {
    return "Book Name - " + getTitle() + "\nAuthor - " + author + "\nISBN # - " + isbn_number;
  }
}
