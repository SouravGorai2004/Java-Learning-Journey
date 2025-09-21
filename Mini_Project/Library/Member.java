package Library;

import java.util.ArrayList;
import java.util.Scanner;

import Library.Book.BookNotAvailableException;

public class Member {
    private String name;
    private Integer memberId;
    private String phno;
    private String address;
    static int counter = 1000;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void addDetails() {
        System.out.print("Please Enter Your name : ");
        this.name = sc.nextLine();
        System.out.print("Please Enter Your Phone No. : ");
        this.phno = sc.nextLine();
        System.out.print("Please Enter Your Address : ");
        this.address = sc.nextLine();
        this.memberId = generateMemberId();
        this.getConfirmationMessage();
    }

    int getMemberId() {
        return this.memberId;
    }

    void getConfirmationMessage() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("The User " + this.name.toUpperCase() + " Succesfully Registerd.");
        System.out.println("Member ID Of " + this.name + " is : " + this.memberId);
        System.out.println("Please Provide All Terms And Condition Of The Library");
        System.out.println("--------------------------------------------------------------------");

    }

    void addBorrowedBook(Book book) {
        this.borrowedBooks.add(book);
        try {
            book.borrowdBooks();
        } catch (BookNotAvailableException b) {
            b.getMessage();

        }
    }

    void getBooks() {
        for (Book b : borrowedBooks) {
            System.out.println(b);
        }
    }

    void returnBook(Book book){
        if (borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            book.returnBook();
        }
        else{
            System.out.println("This book is not borrowed by the user : "+this.name);
        }
    }

    void getDetails() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Name : " + this.name + "                  Member ID : " + this.memberId);
        System.out.println("Phone No : " + this.phno + "       Address : " + this.address);
        System.out.println("--------------------------------------------------------------------");

    }

    private int generateMemberId() {
        return counter++;
    }

}
