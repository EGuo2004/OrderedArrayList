public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int size) {
    super(size);
  }
  public void add(T element) {
    if(element == null) {
      throw new IllegalArgumentException("Can not add a null");
    } else {
      super.add(element);
    }
  }

  public void add(int index, T element) {
    if(element == null) {
      throw new IllegalArgumentException("Can not add a null");
    } else {
      super.add(index , element);
    }
  }
  }
}
