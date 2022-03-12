import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        List<Person> phonebook = new ArrayList<>();

        Phonebook phonebook1 = new Phonebook();



        Person p1 = new Person("Bido", "915-526-4649", "moving water ln", 18);
        Person p2 = new Person("Imaad", "123456789", "im a bad player rd", 1);
        Person p3 = new Person("Omar", "987654321", "im an immortal player ct", 20);

        phonebook.add(p1);
        phonebook.add(p2);
        phonebook.add(p3);

        phonebook1.addPerson(p1);
        phonebook1.addPerson(p2);
        phonebook1.addPerson(p3);

        System.out.println(phonebook1.searchByName("Bido"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to search for a person in the phonebook?");
        String answer = scanner.nextLine();

        if (answer.equals("yes")) {
            System.out.println("Press 1 for name, 2 for number, 3 for address, 4 for age?");
            int decision = Integer.parseInt(scanner.nextLine());
            if (decision == 1) {
                System.out.println("What is their name?");
                String name = scanner.nextLine();
                searchByName(phonebook, name);
            } else if (decision == 2) {
                System.out.println("What is their number?");
                String number = scanner.nextLine();
                searchByNumber(phonebook, number);
            } else if (decision == 3) {
                System.out.println("What is their address?");
                String address = scanner.nextLine();
                searchByAddress(phonebook, address);
            } else if (decision == 4) {
                System.out.println("What is their age?");
                int age = scanner.nextInt();
                searchByAge(phonebook, age);
            }
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

//        if (answer.equals("yes")) {
//            addBerson(phonebook, scanner);
//        }

//        brintBeoble(phonebook);


    private static void brintBeoble(List<Person> phonebook) {
        for (Person kalb : phonebook) {
            System.out.println(kalb);
        }
    }

    private static void addBerson(List<Person> phonebook, Scanner scanner) {
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
}
