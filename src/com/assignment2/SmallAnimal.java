package com.assignment2;

public abstract class SmallAnimal {

    public abstract void eat();
    public abstract void sleep();
/* .this ??
    class Dog extends SmallAnimal{

        @Override
        public void eat() {
            //implementation part comes between the parenthesis
            System.out.println("Dog eats Dog food");
        }

        @Override
        public void sleep() {
            //implementation part comes between the parenthesis
            System.out.println("Dog sleeps Dog time");

        }
    }
*/
    public static void main(String[] args) {
        Dog myDog = new Dog(); //create a dog object
        myDog.eat(); //method calling with object
        myDog.sleep();

        Cat myCat = new Cat(); //create a Cat object
        myCat.eat(); //method calling with object
        myCat.sleep();

    }
}
