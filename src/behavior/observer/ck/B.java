package behavior.observer.ck;

import java.util.ArrayList;
import java.util.List;

public class B implements TopicListener{
    private List<News> receivedNewsList = new ArrayList<>();
    private Topic topic;
    public B(Topic topic) {
        this.topic = topic;
        topic.attachListener(this);
    }

    @Override
    public void print(News news, boolean isNew) {
        if (isNew){
            receivedNewsList.add(news);
            for (int i=0; i<receivedNewsList.size(); i++){
                System.out.println(i + ". " + receivedNewsList.get(i));
            }
        }
        else {
            for (int i=0; i<receivedNewsList.size(); i++){
                if (news == receivedNewsList.get(i)){
                    receivedNewsList.set(i, news);
                }
            }
            System.out.println(news);
        }
    }
}
