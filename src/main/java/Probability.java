public class Probability {
   private final float coinToss;
    public Probability(float coinToss)
    {
    this.coinToss=coinToss;
    }
    float probabilityOfEventNotOccurring()
    {
       return 1-coinToss;
    }
    float probabilityOfEventOccurringTogether()
    {
        return coinToss*coinToss;
    }
}
