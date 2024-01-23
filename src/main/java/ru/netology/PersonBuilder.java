package ru.netology;

public class PersonBuilder {

    public String name;
    public String surname;
    public int age;
    public String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalStateException("Возраст не может быть отрицательным");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {

        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Не задана name или surname");
        } else {
            Person person = new Person(name, surname, age);
            person.setAddress(address);
            return person;
        }
    }
}
