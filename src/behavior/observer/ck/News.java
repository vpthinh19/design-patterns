package behavior.observer.ck;

public class News implements Cloneable{
    private String title;
    private String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public News(News other) {
        this(other.title, other.content);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public News clone() {
        try {
            return (News) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
