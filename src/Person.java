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

    public String greeting(){
        return "Hello my name is " + name;
    }
    public String contact(){
        return "My number is " + number;
    }

}


