package cc.xpbootcamp.warmup.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateFibonacciTest {
    @Test
    public void should_return_1_when_calculate_given_position_is_1() {
        //given
        CalculateFibonacci calculateFibonacci = new CalculateFibonacci();
        int position = 1;

        //when
        int result = calculateFibonacci.calculate(position);

        //then
        assertEquals(1, result);
    }
}
