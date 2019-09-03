public class Probability {
   private float coinToss;
    public Probability(float coinToss)
    {
    this.coinToss=coinToss;
    }
    public float probabilityOfEventNotOccurring()
    {
       return 1-coinToss;
    }
}
