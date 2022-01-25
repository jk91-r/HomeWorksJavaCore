public class Box <F extends Fruit> {
    F arr[];
    int counter=0;

    public Box(F[] arr) {
        this.arr = arr;
    }

    public void add(F obj) {
        if ( counter < arr.length) {
            arr[counter] = obj;
            counter++;
        } else{
            System.out.println("Container is full");
        }
    }

    public double getWeight() {
        double weight = 0;
        for(int i = 0; i < arr.length; i++){
            weight += arr[i].getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box){
        return this.getWeight() == box.getWeight();
    }

    public F[] getArr() {
        return arr;
    }

    public void setArr(F[] arr) {
        this.arr = arr;
    }

}



