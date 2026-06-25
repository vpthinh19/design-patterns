package behavior.observer.ck;

public class A implements TopicListener{
    private Topic topic;
    public A(Topic topic) {
        this.topic = topic;
        topic.attachListener(this);
    }

    @Override
    public void print(News news, boolean isNew) {
        System.out.println(news);
    }
}
