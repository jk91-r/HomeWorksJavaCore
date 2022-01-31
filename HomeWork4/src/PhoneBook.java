import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<Long>> users;

    public PhoneBook() {
        this.users = new HashMap<String, ArrayList<Long>>();
    }

    public void add(String s, Long l) {
        ArrayList<Long> num = new ArrayList<Long>();

        if (this.users.containsKey(s)){
            num = this.users.get(s);
            num.add(l);
            this.users.put(s, num);
        }
        else {
            num.add(l);
            this.users.put(s, num);
        }
    }

    public String get(String s){
        String res = "";

        if (this.users.containsKey(s)) {
            res = "Телефон клиента " + s + ": " +
                    this.users.get(s).toString()
                            .replace("[","")
                            .replace("]", "")
                            .replace(",", "")
                            .trim();
        }
        return res;
    }
}
