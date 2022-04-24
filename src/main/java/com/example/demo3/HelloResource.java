package com.example.demo3;

public class HelloResource {
    public static void main(String[]args){

        Person person1 = new Person();
        person1.name = "Рома";
        person1.age = 50;
        System.out.println("Меня зовут " +person1.name+ ","+ person1.age+"лет" );

        Person person2 =new Person();
        person1.name = "Влад";
        person2.age = 99;
        System.out.println("Меня зовут " +person2.name+ ","+ person2.age+"лет" );

    }
}
class Person{
    String name;
    int age;{
    }
}