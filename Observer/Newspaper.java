import java.util.ArrayList;
import java.util.List;

public class Newspaper {
  private List<Observer> observers;
  private List<String> articles;
  private int issue;

  Newspaper() {
    observers = new ArrayList<Observer>();
    articles = new ArrayList<String>();
  }

  public void registerObserver(Observer o) {
    observers.add(o);
  }

  public void deregisterObserver(Observer o) {
    observers.remove(o);
  }

  public void sendMessage() {
    for (Observer o : observers) {
      o.read(this);;
    }
  }

  public void addArticle(String s) {
    articles.add(s);
    if (articles.size() != 1) issue++;
  }

  public int getIssue() {
    return issue;
  }

  public String getArticle(Integer chosenIssue) {
    return articles.get(chosenIssue);
  }

}
