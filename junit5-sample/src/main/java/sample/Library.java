package sample;

public class Library {

    LibraryDependency dependency;

    public Library() {
    }

    public Library(LibraryDependency dependency) {
        this.dependency = dependency;
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
}
