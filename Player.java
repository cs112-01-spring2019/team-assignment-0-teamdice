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
  public void setPoints(int roll){
    points+=roll;
  }
  public int getPoints(){
    return points;
  }
  public void lost(){
    losses++;
  }
  public void won(){
    wins++;
  }
  public String toString(){
    String result = "";
    result+="Player: "+  name;
    result+="Wins: "+ wins;
    result+="Losses: "+ losses;
  }
}
