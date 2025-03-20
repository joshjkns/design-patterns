public class Dog {
  private static Dog instance;

  Dog() {
    Dog.instance = null;
  }

  public static Dog getInstance() {
    if (instance == null) {
      instance = new Dog();
    }
    return instance;
  }
  
}
