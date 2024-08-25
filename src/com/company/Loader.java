package com.company;

public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        murka.meow();
        System.out.println(murka.getStatus());
        System.out.println("Murka weight1: " + murka.getWeight());
        murka.meow();
        System.out.println("Murka weight2: " + murka.getWeight());

        System.out.println("Murka weight3: " + murka.getWeight());
        murka.drink(murka.getWeight()/100);
        System.out.println("Murka weight4: " + murka.getWeight());

        murka.feed(murka.getWeight() * 100);
        System.out.println("Murka weight5: " + murka.getWeight());
        System.out.println(murka.getStatus());

        murka.getEatenFood(murka.getWeight() + 40.3);
        System.out.println("Murka weight6: " + murka.getWeight());



        System.out.println(Cat.getTotalWeight());
        Cat vasya = new Cat();
        System.out.println("Vasya weight: " + vasya.getWeight());

        //Cat.totalWeight = 10000;
        //System.out.println(vasya.getTotalWeight());

        Computer myNotebook = new Computer();
        myNotebook.processor = new Processor();
        myNotebook.processor.coreCount = 4;
        myNotebook.processor.frequency = 2200;
    }
}
