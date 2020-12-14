import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int size) {
    super(size);
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Index can not be null.");
    } else {
      int i;
      for (i = 0; i < super.size() && element.compareTo(super.get(i)) > 0; i++) {
      }
      super.add(i,element);
      return true;
    }
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Index can not be null.");
    } else {
      add(element);
    }
  }
  
  public T set (int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Index can not be null.");
    } else {
      T x = get(index);
      super.remove(index);
      add(element);
      return x;
    }
  }
}
