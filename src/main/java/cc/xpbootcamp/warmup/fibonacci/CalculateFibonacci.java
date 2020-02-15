package cc.xpbootcamp.warmup.fibonacci;

public class CalculateFibonacci {
    public Long calculate(int position) {
        if (position < 2) {
            return (long) position;
        } else {
            Long[] answer = new Long[position];
            answer[0] = 1L;
            answer[1] = 1L;
            for (int i = 2; i < position; i++) {
                answer[i] = answer[i-1] + answer[i-2];
            }
            return answer[position-1];
        }
    }
}
