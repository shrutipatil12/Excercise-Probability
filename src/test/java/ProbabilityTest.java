import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ProbabilityTest {
    @Test
    void givenOneCoinTossed_WhenCalculateProbability_ThenShouldReturnProbabilityOfNotOccurringEvent(){
        float coinToss=0.5f;
        Probability probabilityZero=new Probability(coinToss);
        assertEquals(0.5f,probabilityZero.probabilityOfEventNotOccurring());
    }
    @Test
    void givenOneCoinTossed_WhenCalculateProbability_ThenShouldReturnProbabilityOfOccurringEventTogether(){
        float probabilityOfTwoEvents=0.5f;
        Probability probability=new Probability(probabilityOfTwoEvents);
        assertEquals(0.25f,probability.probabilityOfEventOccurringTogether());
    }

}
