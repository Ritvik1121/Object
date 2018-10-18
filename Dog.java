public class Dog {

  // Propeties
  String name;
  String breed;
  int tagNumber;
  int happiness = 0;
  boolean LastPet;

    // Constructors
  public Dog(String name, String breed, int tagNumber) {
    this.name  = name;
    this.breed = name;
    this.tagNumber = tagNumber;
    this.happiness = 10;
    this.LastPet = false;

  }

  // Abilities

  // Getter

  public String getName(){
    return this.name;
  }

  public String getBreed(){
    return this.breed;
  }

  public int getTagNumber(){
    return this.tagNumber;
  }

  // Setter

  public void setName(String name){
      this.name = name;
  }

  public void setBreed(String breed){
      this.breed = breed;
  }

  public void setTageNumber(int tagNumber){
      this.tagNumber = tagNumber;
  }

  // Abilities

  public String bark(){
    return "Woof";
  }

  public String SayHi(){
    bark();
    return " My name is " + this.name;
  }

  public void PetDog(){
    this.happiness += 10;
    System.out.println(bark());
    System.out.println("Happiness: " + happiness);
    this.LastPet = true;

  }

  public void eat(){
    if (this.LastPet && this.happiness > 25){
      happiness += 25;
      bark();
      System.out.println("You just fed " + this.name + " Happiness: " + happiness);
      this.LastPet = false;

    } else {
      System.out.println("The dog is refuses to eat try petting the dog more.");
    }
  }

  public void scold(){
    this.happiness -= 20;
    System.out.println("You just scolded " + this.name + " Happiness: " + happiness);

    }


}
