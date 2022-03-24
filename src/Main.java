import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List<Person> phonebook = new ArrayList<>();

        Person p1 = new Person("PersonA", "12345", "address1", 15);
        Person p2 = new Person("PersonB", "67890", "address2", 25);
        Person p3 = new Person("PersonC", "98765", "address3", 20);

        phonebook.add(p1);
        phonebook.add(p2);
        phonebook.add(p3);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select what you would like to do within the phonebook");
            System.out.println("Press 1 to add a person, 2 to update a contact, 3 to search for someone, 4 to print everyone in the phonebook, and 5 to exit");
            int decision = Integer.parseInt(scanner.nextLine());
            if (decision == 1) {
                addPerson(phonebook, scanner);
            } else if (decision == 2) {
                updateContact(phonebook, scanner);
            } else if (decision == 3) {
                System.out.println(findPeople(phonebook, scanner));
            } else if (decision == 4) {
                printPeople(phonebook);
            } else if (decision == 5) {
                System.out.println("Thank you for using the phonebook, goodbye.");
                break;
            }
        }
    }

    private static void updateContact(List<Person> phonebook, Scanner scanner) {
        List<Person> filteredList = findPeople(phonebook, scanner);
        int selection = 0;
        if (filteredList.size() != 1) {
            System.out.println("Please pick a person from 0-" + (filteredList.size() - 1));
            selection = Integer.parseInt(scanner.nextLine());
        }
        Person update = filteredList.get(selection);
        while (true) {
            System.out.println("Choose an entry to update by Press 1 for name, 2 for number, 3 for address, 4 for age");
            int decision1int = Integer.parseInt(scanner.nextLine());
            if (decision1int == 1) {
                System.out.println("What is the new name?");
                update.name = scanner.nextLine();
                break;
            } else if (decision1int == 2) {
                System.out.println("What is the new number?");
                update.number = scanner.nextLine();
                break;
            } else if (decision1int == 3) {
                System.out.println("What is the new address?");
                update.address = scanner.nextLine();
                break;
            } else if (decision1int == 4) {
                System.out.println("What is the new age?");
                update.age = scanner.nextInt();
                break;
            }
            System.out.println("Invalid Option, please enter a correct option.");
        }
        System.out.println("Done");
    }

    private static List<Person> findPeople(List<Person> phonebook, Scanner scanner) {
        while (true) {
            System.out.println("Choose a filter to search by Press 1 for name, 2 for number, 3 for address, 4 for age");
            int decision1int = Integer.parseInt(scanner.nextLine());
            if (decision1int == 1) {
                System.out.println("What is their name?");
                String name = scanner.nextLine();
                return searchByName(phonebook, name);
            } else if (decision1int == 2) {
                System.out.println("What is their number?");
                String number = scanner.nextLine();
                return searchByNumber(phonebook, number);
            } else if (decision1int == 3) {
                System.out.println("What is their address?");
                String address = scanner.nextLine();
                return searchByAddress(phonebook, address);
            } else if (decision1int == 4) {
                System.out.println("What is their age?");
                int age = Integer.parseInt(scanner.nextLine());
                return searchByAge(phonebook, age);
            }
            System.out.println("Invalid Option, please enter a correct option.");
        }
    }

    private static void addPerson(List<Person> phonebook, Scanner scanner) {
        System.out.println("What is their name?");
        String name = scanner.nextLine();
        System.out.println("What is their number?");
        String number = scanner.nextLine();
        System.out.println("What is their address?");
        String address = scanner.nextLine();
        System.out.println("What is their age?");
        int age = scanner.nextInt();
        Person newPerson = new Person(name, number, address, age);
        phonebook.add(newPerson);
        System.out.println("done");
    }

    private static void printPeople(List<Person> phonebook) {
        for (Person p : phonebook) {
            System.out.println(p);
        }
    }

    private static List<Person> searchByAge(List<Person> phonebook, int age) {
        List<Person> filteredList = new ArrayList<>();
        for (Person p : phonebook) {
            if (p.age == age) {
                filteredList.add(p);
            }
        }
        return filteredList;
    }

    private static List<Person> searchByAddress(List<Person> phonebook, String address) {
        List<Person> filteredList = new ArrayList<>();
        for (Person p : phonebook) {
            if (p.address.equals(address)) {
                filteredList.add(p);
            }
        }
        return filteredList;
    }

    private static List<Person> searchByNumber(List<Person> phonebook, String number) {
        return phonebook.stream()
                .filter(person -> person.number.equals(number))
                .collect(Collectors.toList());
    }

    private static List<Person> searchByName(List<Person> phonebook, String name) {
        return phonebook.stream()
                .filter(person -> person.name.equals(name))
                .collect(Collectors.toList());

    }
}

