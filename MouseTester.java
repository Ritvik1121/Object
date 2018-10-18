public class MouseTester{
  public static void main(String[] args) {

    Cat cat = new Cat("whiskers");
    Dog dog = new Dog("Rover", "Dalmation", 1);
    Mouse mouse = new Mouse("Squeakers");

    dog.eat();
    dog.PetDog();
    dog.PetDog();
    dog.eat();

    cat.pet();
    cat.scold();
    cat.scold();
    cat.feed();
    cat.scold();

    mouse.meetCat(cat);
    mouse.meetDog(dog);
    mouse.mouseSpeed();


  }
}
