package cc.xpbootcamp.warmup.fibonacci;

public class CalculateFibonacci {
    public Long calculate(int position) {
        if (position < 2) {
            return (long) position;
        }
        return calculate(position - 1) + calculate(position - 2);
    }
}
