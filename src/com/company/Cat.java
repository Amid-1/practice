package com.company;

public class Cat
{
    public static int catCount = 0;
    public static final int EYES_COUNT = 2;
    public static final int MIN_WEIGHT = 500;
    public static final int MAX_WEIGHT = 11000;
    public static double totalWeight;

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double eatenFood = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }
    //public double getTotalWeight() {
    //    return totalWeight;
    //}

    public static double getTotalWeight() {
        return totalWeight;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public Double getEatenFood(Double amount) {
        eatenFood += amount;
        weight = weight + amount;
        return eatenFood;
    }

    public void pee()
    {
        weight = weight - 20;
        System.out.println("Hooch");
    }

    public static int getCatCount()
    {
        return Cat.catCount;
    }


}
