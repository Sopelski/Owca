package pl.teb.edukacja.owca;

public class Greeting {
    public long getId() {
        return id;
    }

    private final long id;

    public String getContent() {
        return content;
    }

    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}