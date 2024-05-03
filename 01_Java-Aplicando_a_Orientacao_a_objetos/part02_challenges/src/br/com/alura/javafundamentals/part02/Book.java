package br.com.alura.javafundamentals.part02;

public class Book {
    private String  title;
    private String  author;

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

    public void displayDetails(){
        System.out.printf("Title....: %s\n", title);
        System.out.printf("Author...: %s\n", author);
    }
}
