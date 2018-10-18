
public class Parrot{

  String name;
  int talkCounter;
  String lastWord;
  int sameWord;


  public Parrot(String name){

    this.name = name;
    this.talkCounter  = 1;
    this.lastWord = "";
    this.sameWord = 1;
  }

  public String getName(){
    return this.name;
  }

  public void setName(){
    this.name = name;
  }

  public void squawks(){
    System.out.println("Squawk");
  }

  public void repeat(String word){

    if (talkCounter == 3){
      System.out.println(word);
      squawks();
      talkCounter = 0;
    } else {
      System.out.println(word);
      talkCounter += 1;
    }

    if (lastWord.equals(word)){
      sameWord ++;
    }

    lastWord = word;

    if (sameWord == 3){
      squawks();
      squawks();
      sameWord = 0;
    }
  }


}
