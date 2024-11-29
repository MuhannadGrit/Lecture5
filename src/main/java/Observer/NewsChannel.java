package Observer;

public class NewsChannel implements ObserverInterface {
    private String news;
    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("News Channel recived news " + news);
    }
}
