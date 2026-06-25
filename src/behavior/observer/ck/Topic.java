package behavior.observer.ck;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private List<News> newsList = new ArrayList<>();
    private List<TopicListener> listeners = new ArrayList<>();

    public Topic() {
    }
    public void attachListener(TopicListener listener){
        listeners.add(listener);
    }
    public void detachListener(TopicListener listener){
        listeners.remove(listener);
    }
    public void notifyListener(News news, boolean isNew){
        News clone = news.clone();
        for (var listener:listeners){
            listener.print(clone, isNew);
        }
    }
    public void createNews(News news){
        newsList.add(news);
        notifyListener(news, true);
    }
    public void updateNews(int index, News news){
        newsList.set(index, news);
        notifyListener(news, false);
    }
}
