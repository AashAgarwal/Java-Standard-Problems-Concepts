import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        Book book = new Book();

        book.setTitle(title);
        book.setAuthor(author);
        book.setPages(100);

        System.out.println(book);
    }
}

class Book {
    private String title;
    private String author;
    private int pages;

    public String getTitle(String title) {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(String author) {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return "Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.pages;
    }
}