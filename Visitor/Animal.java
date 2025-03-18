public interface Animal {
  String getName();
  
  int getAge();

  void accept(Visitor v);

}