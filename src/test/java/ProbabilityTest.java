import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ProbabilityTest {
    @Test
    void GivenOneCoinTossed_WhenCalculateProbability_ThenShouldReturnProbabilityOfNotOccurringEvent(){
        float coinToss=0.5f;
        Probability probabilityZero=new Probability(coinToss);
        assertEquals(0.5f,probabilityZero.probabilityOfEventNotOccurring());
    }
}
