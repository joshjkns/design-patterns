public class Client {

  public static void main(){
    Animal dog = new Dog("Snoopy", 10);
    Animal cat = new Cat("Garfield", 15);
    // noise visitor
    Visitor noiseVisitor = new NoiseVisitor();
    dog.accept(noiseVisitor);
    cat.accept(noiseVisitor);

    // age visitor
    Visitor ageVisitor = new AgeVisitor();
    dog.accept(ageVisitor);
    cat.accept(ageVisitor);

  }
}