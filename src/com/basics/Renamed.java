package com.basics;
import com.experiment1.Animal; //moved Animal to different package and this popped up automatically

class Renamed {     //class name different to class name (not sure how else to put it)
    //although it didn't allowed me to use public/private/protected. so what class is this?

    public static void main(String[] args) {
        //System.out.print("Hi, ");
        //System.out.print(args[0]);


        String name = "adhineth";
        System.out.println(name.toUpperCase());
        addName("ok");

        Animal a = new Animal();
        String dog = a.iAmDog();
        System.out.println(dog);

        //String AD = addName("Hannu");
        //System.out.println(AD.toUpperCase());
        System.out.println(". How are you?");
    }
 public static void addName(String name){
       System.out.println(name + " munna");
     //return name + "munna";
 }
}