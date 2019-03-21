import java.util.Random;
public class PlayerTest{
  public static void main(String[] args){
    Random gen = new Random();
    Player first = new Player("Anthony");
    Player second = new Player ("Meagen");
    for (int i=0; i<5; i++){
      first.setPoints(gen.nextInt(7)+1);
      second.setPoints(gen.nextInt(7)+1);
      if (first.getPoints()>second.getPoints()){
        System.out.println(">> "+first.getName()+" wins!");
  			first.won();
  			second.lost();
      }
      else if (second.getPoints()>first.getPoints()){
        System.out.println(">> "+second.getName()+" wins!");
  			first.lost();
  			second.won();
      }
      else{
  	System.out.println(">> It's a tie!"); 
  	first.won(); 
  	second.won();
  	}	
      System.out.println(first);
      System.out.println(second);
    }
  }
}
