public class Pig {

  String name;
  float weight;
  double exerciseHours;
  int poundsOfFood;
  boolean lastFed;
  int weightAdd;

  public Pig(String name){
    this.name = name;
    this.weight = 2.89;
    this.exerciseHours = 0;
    this.poundsOfFood = 0
    this.lastFed = false;
  }

  public String getName(){
    return this.name;
  }

  public void setName(){
    this.name = name;
  }

  public void oink(){
    System.out.println("Oink");
  }

  public void feed(int poundsOfFood){
    this.weightAdd = poundsOfFood * .75;
    this.weight = this.weight + this.weightAdd;
    oink();
    System.out.println("You have just fed" + name);
    lastFed = true;

  }

  public void exercise(double exerciseHours){
    if (lastFed){
      this.weight = this.weight - (this.exerciseHours/3);
      oink();
      System.out.println(name + " has just exercised.");
      this.weight = this.weight - this.weightAdd;
      lastFed = false;
    } else {
      this.weight = this.weight - (this.exerciseHours/3);
      oink();
      System.out.println(name + " has just exercised.");
    }

  }

}
