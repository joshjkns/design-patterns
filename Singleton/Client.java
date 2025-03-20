public class Client {

  public static void main() {
    Dog d = Dog.getInstance(); // makes new dog
    Dog e = Dog.getInstance(); // returns same one

    if (d.equals(e)) {
      System.out.println("They are the same!");
    }
  } 
}
