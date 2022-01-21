package dis.ulpgc.es;

public class FibonacciCalculator {
    public Integer getFibonacci(Integer number){
        if(number==0) return 0;
        if(number==1) return 1;
        return getFibonacci(number-1)+getFibonacci(number-2);
    }
}
