public class Player{
  private int points = 0;
  private int losses = 0;
  private int wins = 0;
  private String playerName;
  public Player(String name){
    playerName = name;
  }
  public String getName(){
    return playerName;
  }
  public setPoints(int roll){
    points+=roll;
  }
  public int getPoints(){
    return points;
  }
  public lost(){
    losses++;
  }
  public won(){
    wins++;
  }
  public String toString(){
    String result = "";
    result+="Player: "+  name;
    result+="Wins: "+ wins;
    result+="Losses: "+ losses;
  }
}
