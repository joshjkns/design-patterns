class NoiseVisitor implements Visitor {

  @Override
  public void visit(Dog d) {
    System.out.println(d.getName() + " woofs!");
  }

  @Override
  public void visit(Cat c) {
    System.out.println(c.getName() + " meows!");
  }
  
}
