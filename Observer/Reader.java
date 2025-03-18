public class Reader implements Observer {

  @Override
  public void subscribe(Newspaper v) {
    v.registerObserver(this);
  }

  @Override
  public void read(Newspaper v) {
    System.out.println(v.getArticle(v.getIssue()));
  }
  
}
