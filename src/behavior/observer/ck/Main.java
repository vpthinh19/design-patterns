package behavior.observer.ck;

public class Main {
    static void main() {
        Topic topic = new Topic();
//        A a1 = new A(topic);
        B b1 = new B(topic);
        topic.createNews(new News("t1", "hehe"));
        topic.createNews(new News("t2", "abcxyz"));
        topic.updateNews(0, new News("t2", "haha"));
    }
}
