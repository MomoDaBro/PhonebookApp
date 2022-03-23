import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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
            System.out.println("Press 1 to add a person, 2 to delete someone, 3 to search for someone, 4 to print everyone in the phonebook, and 5 to exit");
            int decision = Integer.parseInt(scanner.nextLine());
            if (decision == 1) {
                addPerson(phonebook, scanner);
            } else if (decision == 2) {
            } else if (decision == 3) {
                System.out.println("Press 1 for name, 2 for number, 3 for address, 4 for age");
                int decision1int = Integer.parseInt(scanner.nextLine());
                if (decision1int == 1) {
                    System.out.println("What is their name?");
                    String name = scanner.nextLine();
                    searchByName(phonebook, name);
                } else if (decision1int == 2) {
                    System.out.println("What is their number?");
                    String number = scanner.nextLine();
                    searchByNumber(phonebook, number);
                } else if (decision1int == 3) {
                    System.out.println("What is their address?");
                    String address = scanner.nextLine();
                    searchByAddress(phonebook, address);
                } else if (decision1int == 4) {
                    System.out.println("What is their age?");
                    int age = scanner.nextInt();
                    searchByAge(phonebook, age);
                }
            } else if (decision == 4) {
                printPeople(phonebook);
            } else if (decision == 5) {
                System.out.println("Thank you for using the phonebook, goodbye.");
                break;
            }
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

    private static void searchByAge(List<Person> phonebook, int age) {
        for (Person p : phonebook) {
            if (p.age == age) {
                System.out.println(p);
            }
        }
    }

    private static void searchByAddress(List<Person> phonebook, String address) {
        for (Person p : phonebook) {
            if (p.address.equals(address)) {
                System.out.println(p);
            }
        }
    }

    private static void searchByNumber(List<Person> phonebook, String number) {
        for (Person p : phonebook) {
            if (p.number.equals(number)) {
                System.out.println(p);
            }
        }
    }

    private static void searchByName(List<Person> phonebook, String name) {
        for (Person p : phonebook) {
            if (p.name.equals(name)) {
                System.out.println(p);
            }
        }
    }
}
