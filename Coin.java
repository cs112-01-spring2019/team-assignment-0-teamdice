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
  
  public void flip() {
    
    int randomNumber = generator.nextInt(2);
    
    if(randomNumber == 0) {
      sideUp = "Heads";
    } else if(randomNumber == 1) {
      sideUp = "Tails";
    }
  }
  
  public boolean isHeads() {
    if(sideUp == "Heads") {
      return true;
    } else {
      return false;
    }
  }
}