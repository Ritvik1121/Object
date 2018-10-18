public class Mouse{

  String name;
  int safety;
  int speed;


  public Mouse(String name){
    this.name = name;
    this.safety = 20;
    this.speed = 0;

  }

  public String getName(){
    return this.name;
  }

  public void setName(){
    this.name = name;
  }

  public void safeness(int safetyChange){
    this.safety += safetyChange;
    if (safety > 100){
      this.safety = 100;
    } else if (safety < 0){
      this.safety = 0;
    } else {
      this.safety = this.safety;
    }
  }

  public void meetCat(Cat cat){
    this.safeness(-20);
    System.out.println(name + " is getting scared.");
  }

  public void meetDog(Dog dog){
    if (dog.getHappiness() >= 50){
      this.safeness(25);
      System.out.println(name + " is not as scared anymore.");
    } else if (dog.getHappiness() <= 49){
      this.safeness(-10);
      System.out.println(name + " is getting scared.");

    }

  }

  public void mouseSpeed(){
    System.out.println(100 - this.safety + " meters per seconds.");
  }





}
