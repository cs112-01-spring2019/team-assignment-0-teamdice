import java.util.Random;

public class Coin {

  private String sideUp;
  
  Random generator = new Random();
  
  public Coin() {
    
    int randomNumber = generator.nextInt(2);
    
    if(randomNumber == 0) {
      sideUp = "Heads";
    } else if(randomNumber == 1) {
      sideUp = "Tails";
    }
  }
  //Try renaming toss to flip(), that's what it's called in DiceGame.java
  public void toss() {
    
    int randomNumber = generator.nextInt(2);
    
    if(randomNumber == 0) {
      sideUp = "Heads";
    } else if(randomNumber == 1) {
      sideUp = "Tails";
    }
  }
  
  //So instead of this method, we need to make one called isHeads().  I think the best way would be to write it out like this:
  // public boolean isHeads(), and then have it return true if sideUp == "heads" and false if sideUp != "heads"
  public String getSideUp() {
    return sideUp;
  }
}
