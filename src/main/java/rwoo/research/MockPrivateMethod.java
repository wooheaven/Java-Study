package rwoo.research;

import java.util.Date;

public class MockPrivateMethod {
    public String getDetails() {
        return "Mock private method example: " + iAmPrivate();
    }

    private String iAmPrivate() {
        return new Date().toString();
    }
}
