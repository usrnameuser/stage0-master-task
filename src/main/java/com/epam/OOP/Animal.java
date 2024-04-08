package com.epam.OOP;

public class Animal {
  public Animal(String color, int NumberOfPaws, boolean hasFur) {
    this.color = color;
    this.NumberOfPaws = NumberOfPaws;
    this.hasFur = hasFur;
  }
  private String color;
  private int NumberOfPaws;
  private boolean hasFur;
  public String getDescription() {
    String colorDescription = "This animal is mostly " + this.color + " .";
    String pawsDescription = " It has " + this.numberOfPaws + " paws";
    String furDescription = " and " + hasFurDescription() + " fur.";
    String description = colorDescription + pawsDescription + furDescription;
    return description;
  }
  private String hasFurDescription() {
    String hasFurDescription;
    if(this.hasFur) {
      hasFurDescription = "a"
    }
    else {
      hasFurDescription = "no"
    }
    return hasFurDescription;
  }
}
