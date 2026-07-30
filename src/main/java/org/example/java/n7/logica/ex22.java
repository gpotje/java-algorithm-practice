package org.example.java.n7.logica;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

enum StatusBook{
    BORROWED,
    AVAILABLE;
}
class Book{
    private String name;
    private int pages;
    private StatusBook statusBook;

    public Book(String name, StatusBook statusBook, int pages) {
        this.name = name;
        this.statusBook = statusBook;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public StatusBook getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(StatusBook statusBook) {
        this.statusBook = statusBook;
    }

    @Override
    public String toString() {
        return name +" ("+statusBook+")";
    }
}
class Library{
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void borrow(int index){
        if(books.get(index).getStatusBook() == StatusBook.AVAILABLE){
            books.get(index).setStatusBook(StatusBook.BORROWED);
        }
    }
    public void returnBook(int index){
        if(books.get(index).getStatusBook() == StatusBook.BORROWED){
            books.get(index).setStatusBook(StatusBook.AVAILABLE);
        }
    }
    public void remove(int index){
        if(books.get(index).getStatusBook() == StatusBook.AVAILABLE){
            books.remove(index);
        }
    }

    public List<Book> getBooks() {
        return books;
    }
    public List<String> listBooksString(){
        List<String> s = new ArrayList<>();
        for(Book b : books){
            s.add(b.toString());
        }
        return  s;
    }
    public int findBook(String word) {
        for (int i = 0; i <= books.size() - 1; i++) {
            if (books.get(i).getName().equals(word)) {
                return i;
            }
        }
        return  -1;
    }
}
public class ex22 {
    public static void main(String[] args) {
        List<String> commands  = List.of("BORROW Java",
                "ADD Java",
                "RETURN Java");

        System.out.println(processLibrary(commands));
    }

    public static List<String> processLibrary(List<String> commands){
        Random random = new Random();
        Library library = new Library();

        for (String s : commands){
            String[] c = s.split(" ");
            int index = library.findBook(c[1]);
            if(c[0].equals("ADD") && index == -1){
                library.addBook(new Book(c[1],StatusBook.AVAILABLE,random.nextInt(100)));
            }
             else if(c[0].equals("BORROW") && index != -1){
                library.borrow(index);
            }
             else if(c[0].equals("RETURN") && index != -1){
                library.returnBook(index);
            }
            else if(c[0].equals("REMOVE") && index != -1){
                library.remove(index);
            }

        }
        return library.listBooksString();
    }

}
