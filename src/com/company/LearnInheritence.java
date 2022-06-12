package com.company;


class Animal {
    String name;
    int otp;
}

public class LearnInheritence {

    // method overloading
//	  this is a method because it has a return type
    void Bark() {
        System.out.println("i am a dog and i bark");
    }
    // method overloading can be done when we use paramaters in a class to pass it
    void Bark(int times) {
        System.out.println("i can do my homework " + times +""  + "times");
    }


    // i have called the default constructor in order to check how does it work

    // this is a default constructor &&
    //	constructor	 it doesnot have a return type
    public LearnInheritence() {
        System.out.println("i am calling the construcctor");
    }
    // constructor overloading is same like method overloading
    public LearnInheritence(String newname) {
        System.out.println(newname + "was passed while creating an object");
    }


    public static void main(String[] args) {

        // somewhere we are using default constructor in this code


        // calling a class method by creating an object
        LearnInheritence a = new LearnInheritence("samarth");
        a.Bark(5);

        // this is how i have created an object of animal class and called them over here
        Animal donkey = new Animal();
        donkey.name="samarth";
        donkey.otp = 45;

        System.out.println(donkey.name);
        System.out.println(donkey.otp);



    }

}

