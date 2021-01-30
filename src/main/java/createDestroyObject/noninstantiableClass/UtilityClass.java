package createDestroyObject.noninstantiableClass;

public class UtilityClass {

  // Suppress default constructors
  // for noninstantiability
  private UtilityClass() {
    throw new AssertionError();
  }

  // Some static functions here
}
