package  plan;
public class Request {
    public enum Type {
        BUILT,
        LEARNED,
        FIXED
    }
    public enum Status{
        OPEN
    }

    private String id;
    private String title;
    private Type type;
    private Status status;

    public Request(String id, Type type, String title) {
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("DESCRIPTION CANNOT BE BLANK");
        }
        this.id = id;
        this.type = type;
        this.title = title;
        this.status = Status.OPEN;
    }

    public String getId() {
        return this.id;
    }

    public Type getType() {
        return this.type;
    }

    public String getTitle() {
        return this.title;
    }

    public Status getStatus() {
        return this.status;
    }
}