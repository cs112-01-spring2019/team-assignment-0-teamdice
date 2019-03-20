public class Player{
  private int Wins = 0;
  private int Losses = 0;
  public tallyWins(){
    Wins++;
  }
  public tallyLosses(){
    Losses++;
  }
  public int getWins(){
    return Wins;
  }
  public int getLosses(){
    return Losses;
  }
}
