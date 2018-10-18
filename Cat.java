public class Cat {

  String name;
  int happiness;
  int scoldCount;

  public Cat(String name){
    this.name = name;
    this. happiness = 0;
    this.scoldCount = 0;
  }

  public String getName(){
    return this.name;
  }

  public int getHappiness(){
    return this.happiness;
  }

  public int getScoldCount(){
    return this.scoldCount;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setHappiness(int happiness){
    this.happiness = happiness;
  }

  public void setScoldCount(int scoldCount){
    this.scoldCount = scoldCount;
  }

  public void pet(){
    happiness -= 50;
    System.out.println(name + " doesn't like that.");
  }

  public void scold(){
    scoldCount += 1;
    System.out.println(name + " has just been scolded.");
  }

  public void feed(){
    if (scoldCount >= 3){
      System.out.println("You have just fed " + name);
      happiness += 20;
      scoldCount = 0;
    } else {
      System.out.println("Maybe try scolding your cat more.");
    }
  }


}
