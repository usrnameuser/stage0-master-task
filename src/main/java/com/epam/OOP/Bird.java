package com.epam.OOP;

public class Bird extends Animal {
  public Bird() {
    super("blue", 2, false);
  }

  public String getDescription() {
    String description;
    String moreDescription = " Moreover, it has 2 wings and can fly.";
    description = super.getDescription() + moreDescription;
    return description;
  }  
}
