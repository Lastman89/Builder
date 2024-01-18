package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person girl = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        System.out.println(girl);
    }
}