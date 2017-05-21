package sample;

public class Library {
    public void throwRuntimeException() {
        throw new RuntimeException();
    }

    public void timeout(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void doSomethingWith(PassedDependency passed) {
        passed.something();
    }
}
