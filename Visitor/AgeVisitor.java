class AgeVisitor implements Visitor {

  @Override
  public void visit(Dog d) {
    System.out.println(d.getName() + " is " + d.getAge() + " years old!");
  }

  @Override
  public void visit(Cat c) {
    System.out.println(c.getName() + " is " + c.getAge() + " years old!");
  }
  
}
