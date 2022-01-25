public class Main {

    public static void main(String[] args) {
        //задача 1.
	String[] arr = new String[5];
    Container<String> container = new Container<String>(arr);

    String a1 = "Cat";
    String a2 = "Dog";
    String a3 = "Parrot";
    String a4 = "Cow";
    String a5 = "Duck";

    container.add(a1);
    container.add(a2);
    container.add(a3);
    container.add(a4);
    container.add(a5);

    for(int i = 0; i < arr.length; i++){
       System.out.println(container.getArr()[i]);
    }

    container.change();
        for(int i = 0; i < arr.length; i++){
            System.out.println(container.getArr()[i]);
        }

     //задача 2.
        Apple[] apple = new Apple[3];
//        Apple[] apple = new Apple[5];
        Orange[] orange = new Orange[2];

        Box<Apple> appleBox = new Box<>(apple);
        Box<Orange> orangeBox = new Box<>(orange);

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
//        appleBox.add(new Apple());
//        appleBox.add(new Apple());

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(orangeBox.compare(appleBox));

    }
}
