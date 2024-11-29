package Observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel newsChannel1 = new NewsChannel();
        NewsChannel newsChannel2 = new NewsChannel();

        newsAgency.addObserver(newsChannel1);
        newsAgency.addObserver(newsChannel2);

        newsAgency.setNews("Breaking news : Observer is awesome!");
    }
}
