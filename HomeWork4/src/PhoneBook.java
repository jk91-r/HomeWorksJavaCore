import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> users = new HashMap<>();
    private ArrayList<String> list;

    public void add(String lastName, String phoneNumber) {

        if (users.containsKey(lastName)) {
            list = users.get(lastName);
            list.add(phoneNumber);
            users.put(lastName, list);
        } else {
            list = new ArrayList<>();
            list.add(phoneNumber);
            users.put(lastName, list);
        }
    }

    public ArrayList<String> get(String lastname) {
        return users.get(lastname) ;
    }
}
