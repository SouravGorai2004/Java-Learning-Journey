package Library;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;
    static int counter = 155;

    Book() {
        this.isAvailable = true;
        this.bookId = generateBookId();
    }

    private int generateBookId() {
        return counter++;
    }

    Scanner sc = new Scanner(System.in);

    int getBookId(){
        return this.bookId;
    }
    String getTitle(){
        return this.title;
    }
    void setDetails() {
        System.out.print("Enter The Title Of Book : ");
        this.title = sc.nextLine();
        System.out.print("Enter The Author Name Of Book : ");
        this.author = sc.nextLine();
    }

    void getDetails() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Book ID : " + this.bookId);
        System.out.println("Title : " + this.title + "      Author Name: " + this.author);
        System.out.println("--------------------------------------------------------------------");

    }
    void returnBook(){
        if(!isAvailable){
            isAvailable=true;
            System.out.println("Return Sucsessfull...");
        }else{
            System.out.println("This Book is not Borrowed");
        }
    }
    void borrowdBooks() throws BookNotAvailableException{
        if(!isAvailable){
            throw new BookNotAvailableException("This Book is currently Not Available...");
        }
        else{
            isAvailable=false;
            System.out.println(this.title+" is borrowed successfully");
        }

    }


    class BookNotAvailableException extends Exception {
        BookNotAvailableException(String msg) {
            super(msg);

        }

        @Override
        public String toString() {
            return this.getMessage();

        }
    }
    @Override
    public String toString(){
        return ("Book ID : "+this.bookId+", Title : "+this.title+", Author : "+this.author);
    }

}
