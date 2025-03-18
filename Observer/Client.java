class Client {
  public static void main() {
    Observer reader = new Reader();
    Observer reader2 = new Reader();
    Newspaper newspaper = new Newspaper();
    newspaper.addArticle("This is a test article");
    reader.subscribe(newspaper);
    reader.read(newspaper);
    reader2.subscribe(newspaper);
    newspaper.addArticle("This is another test article");
    newspaper.sendMessage();

  }
}