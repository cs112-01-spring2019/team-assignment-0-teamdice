public class CoinTest {

  public static void main(String[] args) {
  
    Coin c = new Coin();
    
    int headsCount = 0;
    
    int tailsCount = 0;
    
    System.out.println("Initial Face in Coin: " + c.getSideUp());
    
    System.out.println("Trial\tSide Up");
    
    for(int i = 1; i <= 10; i++) {
      c.toss();
      System.out.println(i + "\t" + c.getSideUp());
      if(c.getSideUp().equalsIgnoreCase("Heads")) {
        headsCount++;
      } else {
        tailsCount++;
      }
    System.out.println("Total heads: " + headsCount + ", Total tails: " + tailsCount);
    }
  }
}