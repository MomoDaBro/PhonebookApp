import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    List<Person> phonebook = new ArrayList<>();

    public void addPerson(Person newPerson) {

        phonebook.add(newPerson);

    }

    public Person searchByName(String name) {

        for (Person p : phonebook) {
            if (p.name.equals(name)) {
                return p;
            }
        }
        return null;
    }

}
