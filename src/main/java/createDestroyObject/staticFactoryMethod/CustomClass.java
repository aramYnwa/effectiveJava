package createDestroyObject.staticFactoryMethod;

public class CustomClass {
  private String name;
  private String email;
  private static CustomClass emptyInstance;
  private static CustomClass instanceWithName;

  static {
    emptyInstance = new CustomClass();
    instanceWithName = new CustomClass("name", null);
  }

  public CustomClass() {
    this.name = null;
    this.email = null;
  }

  public CustomClass(String name) {
    this.name = name;
  }

  public CustomClass(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public static CustomClass getCustomInstanceWithName(String name) {
    return new CustomClass(name, null);
  }

  public static CustomClass getCustomInstanceWithEmail(String email) {
    return new CustomClass(null, email);
  }

  public static CustomClass getEmptyInstance() {
    return emptyInstance;
  }

  public static CustomClass getInstanceWithName(String name) {
    emptyInstance.setName(name);
    return emptyInstance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static CustomClass of(boolean condition) {
    if (condition) {
      return new SubclassOne();
    } else {
      return new SubclassTwo();
    }
  }
}
