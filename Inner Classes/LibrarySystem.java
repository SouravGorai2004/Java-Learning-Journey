import java.util.ArrayList;
class Library{
    public  ArrayList<Book> books =new ArrayList<>();
    class Book{
        private String title;
        private String author;
        private String isbn;
        
       
        Book(String title, String author, String isbn){
            this.title=title;
            this.author=author;
            this.isbn=isbn;
        }
        public void display(){
            System.out.println("Title : "+this.title+" Author : "+this.author+" ISBN : "+this.isbn);
        }
    }
     
    void addBook(String title, String author, String isbn){
        books.add(new Book(title,author,isbn));
    }
    void showBooks(){
        System.out.println("---------------Books in the Library:---------------");
        for (Book b:books){
            b.display();
        }
        System.out.println("---------------END---------------");
    }

}




public class LibrarySystem {
    public static void main(String[] args) {
        Library lb =new Library();
        lb.addBook("Ramayan","K.S. Thakur","58964789");
        lb.addBook("Mahabharat","R.M Krishna","47896589");
        lb.addBook("Java","jeams Grosling","485965154");
        lb.addBook("C++","G.S Narayan","155059965");
        lb.showBooks();
        Library.Book b = lb.new Book("Operating System","A.B Sen","45789631") ;
        lb.books.add(b);
        lb.showBooks();
    }
}
