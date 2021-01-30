package createDestroyObject.builderPattern;

public class NutritionFactsProblem {
  private final int servingSize; // required
  private final int servings; // required
  private final int calories; // optional

  private final int fat; // optional
  private final int sodium; // optional
  private final int carbohydrate; // optional

  // We have to have a constructor with all params
  public NutritionFactsProblem(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
   this.servingSize = servingSize;
   this.servings = servings;
   this.calories = calories;
   this.fat = fat;
   this.sodium = sodium;
   this.carbohydrate = carbohydrate;
  }

  // Let's apply telescoping pattern
  public NutritionFactsProblem(int servingSize, int servings, int calories, int fat, int sodium) {
     this (servingSize, servings, calories, fat, sodium , 0);
  }

  public NutritionFactsProblem(int servingSize, int servings, int calories, int fat) {
    this (servingSize, servings, calories, fat,  0, 0);
  }

  public NutritionFactsProblem(int servingSize, int servings, int calories) {
    this (servingSize, servings, calories, 0, 0, 0);
  }

  public NutritionFactsProblem(int servingSize, int servings) {
    this (servingSize, servings, 0,0,0, 0);
  }
}
