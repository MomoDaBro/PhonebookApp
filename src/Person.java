public class Person {

    final String name;
    final String number;
    final String address;
    final int age;

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

    public String greeting(){
        return "Hello my name is " + name;
    }
    public String contact(){
        return "My number is " + number;
    }

}


