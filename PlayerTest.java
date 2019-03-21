public class PlayerTest{
  public static main(String[] args){
    Player first = new Player("Anthony");
    Player second = new Player ("Meagen");
    first.setPoints(6);
    second.setPoints(3);
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
    else {
			System.out.println(">> It's a tie!"); 
			first.won(); 
			second.won();
		}	
  }
}
