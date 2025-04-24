import java.util.ArrayList;

class IterableArrayList<X> extends ArrayList<X> implements Iterable<X> {

  public Iterator<X> customIterator() {
    int index = 0;
  
    @Override
    public X next() {
      X val = get(index);
      index++;
      return val;
    }
  
    @Override
    public boolean hasNext() {
      return (index < size());
    }
  }

  public Iterator<X> iterator() {
    return customIterator();
  }


}