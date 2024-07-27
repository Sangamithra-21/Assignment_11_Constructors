package Assignment_11_Constructors;

import java.util.ArrayList;

class Book {
    String title;
    int ISBN;
    static int isbn=1;
    String author;
     private float price;
    Book(String title,String author,float price)
    {
        this.title=title;
        this.ISBN=isbn+1;
        isbn++;
        this.author=author;
        this.price=price;
    }
    void display()
    {
        System.out.println("Book Title  : "+title);
        System.out.println("ISBN NUmber : "+ISBN);
        System.out.println("Author Name : "+author);
        System.out.println("Book price  : "+price);
        System.out.println("-------------------------------------------------------");
    }
}
public class BookDemo
{
    public static void main(String[] args) {
        ArrayList<Book> bookList=new ArrayList<>();
        Book b1=new Book("Pride and rejudice","Jane Austen",450);
        bookList.add(b1);
        Book b2=new Book("Becoming","Michelle Obema",320);
        bookList.add(b2);
        for(Book b : bookList)
        {
            b.display();
        }


    }
}
