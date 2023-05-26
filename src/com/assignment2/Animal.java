package com.assignment2;
// Default constructor & parameterized constructor


public class Animal {
    public int body;
    public int head;
    public Animal(){
        this.body=10;
        this.head=111;
    }

    public Animal(int body){
        this.body= body;
        this.head= body*10;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.body);
        System.out.println(animal.head);
        Animal animal2 = new Animal(44);
        System.out.println(animal2.body);
        System.out.println(animal2.head);
    }
}

