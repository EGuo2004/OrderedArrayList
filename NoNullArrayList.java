import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int size) {
    super(size);
  }
  public boolean add(T element) {
    if(element == null) {
      throw new IllegalArgumentException("Can not add a null");
    } else {
      super.add(element);
      return true;
    }
  }

  public void add(int index, T element) {
    if(element == null) {
      throw new IllegalArgumentException("Can not add a null");
    } else {
      super.add(index , element);
    }
  }

  public T set(int index, T element) {
    if(element == null) {
      throw new IllegalArgumentException("Can not add a null");
    } else {
      T x = super.get(index);
      super.set(index , element);
      return x;
    }
  }
}
