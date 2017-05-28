package sample;

import sample.nested.Book;
import sample.nested.Books;

public class Library {

    LibraryDependency dependency;
    private Books books;

    public Library() {
    }

    public Library(LibraryDependency dependency) {
        this.dependency = dependency;
    }

    public Library(Books books) {

        this.books = books;
    }

    public void throwRuntimeException() {
        throw new RuntimeException();
    }

    public void timeout(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void doSomethingWith(PassedDependency passed) {
        passed.something();
    }

    public boolean returnTrue() {
        return true;
    }

    public void doSometingWithDependency() {
        dependency.something();
    }

    public void addBook(Book book) {

    }
}
