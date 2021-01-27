package createDestroyObject.staticFactoryMethod;

public class Main {
  CustomClass cc = new CustomClass("Okay");
  CustomClass ccWithName = CustomClass.getCustomInstanceWithName("Name");
  CustomClass CcWithEmail = CustomClass.getCustomInstanceWithEmail("email@mail.com");
}
