package createDestroyObject.builderPattern;

public class NutritionFacts {
  private final int servingSize; // required
  private final int servings; // required
  private final int calories; // optional

  private final int fat; // optional
  private final int sodium; // optional
  private final int carbohydrate; // optional

  private NutritionFacts(Builder builder) {
    this.servingSize = builder.servingSize;
    this.servings = builder.servings;
    this.calories = builder.calories;
    this.fat = builder.fat;
    this.sodium = builder.sodium;
    this.carbohydrate = builder.carbohydrate;
  }

  static class Builder {
    private final int servingSize; // required
    private final int servings; // required
    private int calories; // optional
    private int fat; // optional
    private int sodium; // optional
    private int carbohydrate; // optional

    public Builder(int servingsSize, int servings) {
      this.servingSize = servingsSize;
      this.servings = servings;
    }

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }

    public Builder setCalories(int calories) {
      this.calories = calories;
      return this;
    }

    public Builder setFat(int fat) {
      this.fat = fat;
      return this;
    }

    public Builder setSodium(int sodium) {
      this.sodium = sodium;
      return this;
    }

    public Builder setCarbohydrate(int carbohydrate) {
      this.carbohydrate = carbohydrate;
      return this;
    }
  }
}
