package rwoo.research;

public class MockPrivateMethod {
    public String getDetails() {
        return "Mock private method example: " + iAmPrivate();
    }

    private String iAmPrivate() {
        return "iAmPrivateReturn";
    }
}
