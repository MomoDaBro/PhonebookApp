import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Person {

    public String name;
    public String number;
    public String address;
    public int age;

    public Person(String name, String number, String address, int age) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public static Person parsePerson(String line) {
        String[] tokens = line.split(":");
        return new Person(tokens[0],tokens[1],tokens[2],Integer.parseInt(tokens[3]));
    }
}



