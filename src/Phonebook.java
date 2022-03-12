import java.util.ArrayList;
import java.util.List;

/**
 * A phonebook of persons
 */
public class Phonebook {

    List<Person> phonebook = new ArrayList<>();

    /**
     * Adds a new person into this phonebook
     * @param newPerson the person you are adding into the phonebook
     */
    public void addPerson(Person newPerson) {

        phonebook.add(newPerson);

    }


    /**
     * Searches for a name in this phonebook
     * @param name the name to search for
     * @return a person if found or null if not found
     */
    public Person searchByName(String name) {

        for (Person p : phonebook) {
            if (p.name.equals(name)) {
                return p;
            }
        }
        return null;
    }

}
