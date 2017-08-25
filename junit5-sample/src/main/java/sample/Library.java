package sample;

import sample.nested.Book;
import sample.nested.Books;

public class Library {

    LibraryDependency dependency;


    public Library(LibraryDependency dependency) {
        this.dependency = dependency;
    }

    public void throwRuntimeException(String message) {
        throw new RuntimeException(message);
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
