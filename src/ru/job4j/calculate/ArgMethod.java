package ru.job4j.calculate;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("I am " + age + " years old.");
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        ArgMethod.hello(name, age);
    }
}
