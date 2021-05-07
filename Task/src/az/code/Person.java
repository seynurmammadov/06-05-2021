package az.code;

public class Person {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Person setName(String name){
        return new Person(name,this.surname,this.age);
    }
    public Person setSurname(String surname){
        return new Person(this.name,surname,this.age);
    }
    public Person setAge(int age){
        return new Person(this.name,this.surname,age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Age=" + age +
                '}';
    }
}
