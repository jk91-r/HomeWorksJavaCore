import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //задача 1.
        ArrayList<String> arr = new ArrayList<>();

        arr.add("orthodox");
        arr.add("surfboard");
        arr.add("village");
        arr.add("badminton");
        arr.add("mix");
        arr.add("mix");
        arr.add("rainstorm");
        arr.add("golden");
        arr.add("golden");
        arr.add("mix");

        HashSet<String> hashSet = new HashSet<>(arr);

            System.out.println(arr);
            System.out.println(hashSet);

        HashMap<String, Integer> repeat = new HashMap<>();
            for (String word : arr){
                if (repeat.get(word) == null){
                repeat.put(word,1);
            } else {
                repeat.put(word, repeat.get(word) + 1);
                }
            }
        System.out.println(repeat);
//            Map<Object, Long> repeat = arr.stream().collect(Collectors.groupingBy(String -> String ,Collectors.counting()));
//            System.out.println(repeat);


        // задача 2.
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov","89995553535");
        phoneBook.add("Rogers","89559995959");
        phoneBook.add("Ivanov", "89333335353");
        phoneBook.add("Petrov", "89999555555");

        System.out.println(phoneBook.get("Ivanov"));

    }

}
