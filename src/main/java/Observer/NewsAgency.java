package Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<ObserverInterface> observers = new ArrayList<>();
    private String news;


    public void addObserver(ObserverInterface observer)
    {
        observers.add(observer);
    }

    public void removeObserver(ObserverInterface observer){
        observers.remove(observer);
    }

    public void setNews(String news){
        this.news = news;
        notifyObservers();
    }

    private void notifyObservers(){
        for (ObserverInterface observer : observers){
            observer.update(news);
        }
    }

}
