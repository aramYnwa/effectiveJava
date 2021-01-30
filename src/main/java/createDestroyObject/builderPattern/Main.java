package createDestroyObject.builderPattern;

import createDestroyObject.builderPattern.Pizza.Topping;

public class Main {

  Calzone calzone = new Calzone.Builder()
    .addTopping(Topping.HAM)
    .sauceInside()
    .build();

}
