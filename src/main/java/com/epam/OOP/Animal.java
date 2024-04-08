package com.epam.OOP;

public class Animal {
  public Animal(String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }
  
  private String color;
  private int numberOfPaws;
  private boolean hasFur;
  
  public String getDescription() {
    String colorDescription = "This animal is mostly " + this.color + " .";
    String pawsDescription = " It has " + this.numberOfPaws + " " + numberOfPawsDescription();
    String furDescription = " and " + hasFurDescription() + " fur.";
    String description = colorDescription + pawsDescription + furDescription;
    return description;
  }
  
  private String hasFurDescription() {
    String hasFurDescription;
    if(this.hasFur) {
      hasFurDescription = "a";
    }
    else {
      hasFurDescription = "no";
    }
    return hasFurDescription;
  }

  private String numberOfPawsDescription() {
    String numberOfPawsDescription;
    if(isOnePaw()) {
      numberOfPawsDescription = "paw";
    }
    else {
      numberOfPawsDescription = "paws";
    }
    return numberOfPawsDescription;
  }
  private boolean isOnePaw() {
    boolean onePaw;
    if(this.numberOfPaws == 1) {
      onePaw = true;
    }
    else {
      onePaw = false;
    }
    return onePaw;
  }
}
