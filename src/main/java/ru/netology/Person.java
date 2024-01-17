package ru.netology;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if(this.age == age) {
            return true;
        }
        return false;
    }
    public boolean hasAddress() {
        if(this.address == address) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public OptionalInt getAge() { /*...*/ }
    public String getAddress() { /*...*/ }

    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() {
        this.age = age + 1;
    }

    @Override
    public String toString() { /*...*/ }

    @Override
    public int hashCode() { /*...*/ }
}
