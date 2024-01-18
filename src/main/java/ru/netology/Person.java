package ru.netology;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;



    /*public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }*/

    public Person (String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }


    public boolean hasAge() {
        return this.age >= 0;
    }
    public boolean hasAddress() {
        return this.address != null;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public OptionalInt getAge() {
        if (hasAge()) {
            return OptionalInt.of(age);
        }
        return OptionalInt.empty();
    }
    public String getAddress() {
        if (hasAddress()) {
            return address;
        }
        return null;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() {
        this.age = age + 1;
    }

    @Override
    public String toString() {
        return "Person: " +
                "\nИмя: " + getName() +
                "\nФамилия: " + getSurname() +
                "\nВозраст " + getAge().getAsInt() +
                "\nАдрес: " + getAddress();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }


}
