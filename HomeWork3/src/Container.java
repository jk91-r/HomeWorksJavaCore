import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Container<Type1> {
  Type1 arr[];
  int counter = 0;

  public Container(Type1[] arr) {
      this.arr = arr;
  }

  public void add(Type1 obj) {
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
      Type1 c = arr[4];
      arr[4] = arr[1];
      arr[1] = c;
      for (int i = 0; i < arr.length; i++) {
      }
  }

  public Type1[] getArr() {
      return arr;
  }

  public void setArr(Type1[] arr) {
      this.arr = arr;
  }

}
