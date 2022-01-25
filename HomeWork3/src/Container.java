import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Container<T> {
  T arr[];
  int counter = 0;

  public Container(T[] arr) {
      this.arr = arr;
  }

  public void add(T obj) {
      if ( counter < 5) {
          arr[counter] = obj;
          counter++;
      } else{
          System.out.println("Container is full");
      }
  }

  public void delete() {
      if (counter > 0) {
          arr[counter] = null;
          counter--;
      } else{
          System.out.println("Container is empty");
      }
  }

  public void change(){
      T c = arr[4];
      arr[4] = arr[1];
      arr[1] = c;
      for (int i = 0; i < arr.length; i++) {
      }
  }

  public T[] getArr() {
      return arr;
  }

  public void setArr(T[] arr) {
      this.arr = arr;
  }

}
