//Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library. The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook.

import java.util.Scanner;

class Book{

  String title;

  String author;

  int ISBN;

  String Publisher;

public String getTitle() {

    return title;

}

public void setTitle(String title) {

    this.title = title;

}

public String getAuthor() {

    return author;

}

public void setAuthor(String author) {

    this.author = author;

}

public int getISBN() {

    return ISBN;

}

public void setISBN(int iSBN) {

    ISBN = iSBN;

}

public String getPublisher() {

    return Publisher;

}

public void setPublisher(String publisher) {

    Publisher = publisher;

}


}

class Author extends Book{

  String name;

  String email;

  int booksList;

public String getName() {

    return name;

}

public void setName(String name) {

    this.name = name;

}

public String getEmail() {

    return email;

}

public void setEmail(String email) {

    this.email = email;

}

public int getBooksList() {

    return booksList;

}

public void setBooksList(int booksList) {

    this.booksList = booksList;

}


}

class LibraryManagementSystem{

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.println("enter the n value");

    int n=sc.nextInt();

    sc.nextLine();

    Author obj[]=new Author[n];

 

    for(int i=0;i<n;i++){

      obj[i]=new Author();

      System.out.print("enter the title");

      String title=sc.nextLine();

      obj[i].setTitle(title);


      System.out.print("enter the author name:");

      String author=sc.nextLine();

      obj[i].setAuthor(title);

      System.out.print("enter the ISBN name:");

      int iSBN=sc.nextInt();

      obj[i].setISBN(iSBN);

      System.out.print("enter the publisher name:");

      String Publisher=sc.nextLine();

      obj[i].setPublisher(Publisher);

      sc.nextLine();

      System.out.print("enter the  name:");

      String name=sc.nextLine();

      obj[i].setName(name);

      System.out.print("enter the email name:");

      String email=sc.nextLine();

      obj[i].setEmail(email);

      System.out.print("enter the no of books:");

      int bookList=sc.nextInt();

      System.out.println("enter the book details to add");

      System.out.print("enter the title");

      String title1=sc.nextLine();

      obj[i].setTitle(title1);

      sc.nextLine();

      System.out.print("enter the author name:");

      String author1=sc.nextLine();

      obj[i].setAuthor(author1);

      System.out.print("enter the ISBN name:");

      int iSBN1=sc.nextInt();

      obj[i].setISBN(iSBN1);

      System.out.print("enter the publisher name:");

      String Publisher1=sc.nextLine();

      obj[i].setPublisher(Publisher1);

      System.out.print("enter the  name:");

      String name1=sc.nextLine();

      obj[i].setName(name1);

      System.out.print("enter the email name:");

      String email1=sc.nextLine();

      obj[i].setEmail(email1);

      bookList=+1;

      obj[i].setBooksList(bookList);

    }

    for(int i=0;i<n;i++){

      System.out.println("Library Mangement system");

      System.out.println("Title:"+obj[i].getTitle());

      System.out.println("author:"+obj[i].getAuthor());

      System.out.println("isbn:"+obj[i].getISBN());

      System.out.println("publisher:"+obj[i].getPublisher());

      System.out.println("name:"+obj[i].getName());

      System.out.println("email:"+obj[i].getEmail());

      System.out.println("books list:"+obj[i].getBooksList());

    }

  }

}