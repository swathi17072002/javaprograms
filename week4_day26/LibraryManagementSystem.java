/*Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library. The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook.*/
import java.util.Scanner;
class Book {
  String title;
  String author;
  long ISBN;
  String publisher;
  Book(String title1,String author1,long ISBN1,String publisher1){
    title = title1;
    author = author1;
    ISBN = ISBN1;
    publisher = publisher1;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public long getISBN(){
    return ISBN;
  }
  public String getPublisher(){
    return publisher;
  }
}
class Author extends Book{
  int listBooks;
  String name;
  String email;
  Author(int listBooks1,String name1,String email1,String title1,String author1,long ISBN1,String publisher1){
    super(title1,author1,ISBN1,publisher1);
    name = name1;
    email = email1;
    listBooks = listBooks1;
  }
  public String getName(){
    return name;
  }
  public String getEmail(){
    return email;
  }
  public int getListBooks(){
    return listBooks;
  }
}
public class LibraryManagementSystem{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter n value");
  int n =sc.nextInt();
  Author author[] = new Author[n];
  for(int i=0;i<n;i++){
    
    System.out.println("Enter book "+(i+1)+" details :");
    System.out.println("enter name of the author :");
    String name1 = sc.nextLine();
    sc.nextLine();
    System.out.println("enter number of books :");
    int listBooks1 = sc.nextInt();

    sc.nextLine();
    System.out.println("enter email :");
    String email1 = sc.nextLine();
    
    System.out.println("enter title :");
    String title1 = sc.nextLine();
    
    System.out.println("enter author :");
    String author1 = sc.nextLine();
    
    System.out.println("enter ISBN :");
    long ISBN1 = sc.nextLong();

    sc.nextLine();
    System.out.println("enter publisher :");
    String publisher1 = sc.nextLine();

    author[i] = new Author(listBooks1,name1,email1,title1,author1,ISBN1,publisher1);
  }
  for(int i=0;i<n;i++){
    System.out.println("Book "+(i+1)+" details :");
    System.out.println("Title : "+author[i].getTitle());
    System.out.println("Author : "+author[i].getAuthor());
    System.out.println("ISBN : "+author[i].getISBN());
    System.out.println("Publisher : "+author[i].getPublisher());
    System.out.println("Name : "+author[i].getName());
    System.out.println("Email : "+author[i].getEmail());
    System.out.println("Number of books : "+author[i].getListBooks());
  }
}
}