package cc.xpbootcamp.warmup.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateFibonacciTest {
    @Test
    public void should_return_1_when_calculate_given_position_is_1() {
        //given
        CalculateFibonacci calculateFibonacci = new CalculateFibonacci();

        //when
        int result = calculateFibonacci.calculate(1);

        //then
        assertEquals(1, result);
    }

    @Test
    public void should_return_2_when_calculate_given_position_is_3() {
        //given
        CalculateFibonacci calculateFibonacci = new CalculateFibonacci();

        //when
        int result = calculateFibonacci.calculate(3);

        //then
        assertEquals(2, result);
    }
}
