import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    public HashMap<String, String> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String name, String number) {
        this.phonebook.put(name, number);
    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public String findName(String number) {
        for (Map.Entry<String, String> entry : this.phonebook.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return "not found";
    }

    public String findNumber(String name) {
        if (this.phonebook.get(name) != null) return this.phonebook.get(name);
        else return "not found";
    }

    public void printAll() {
        for (Map.Entry<String, String> entry : this.phonebook.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
