package dis.ulpgc.es;

public class ProductFibCalculator {
    FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
    public Integer[] productFib(Integer product){
        Integer[] productFib  = new Integer[]{0,1,0};
        for (int i = 0; i <= product; i++) {
            if(fibonacciCalculator.getFibonacci(i) * fibonacciCalculator.getFibonacci(i+1)>product){
                productFib[2]=0;
                break;
            }
            productFib[0]=fibonacciCalculator.getFibonacci(i);
            productFib[1]=fibonacciCalculator.getFibonacci(i+1);
            if(fibonacciCalculator.getFibonacci(i) * fibonacciCalculator.getFibonacci(i+1)==product){
                productFib[2]=1;
                break;
            }

        }
        return productFib;
    }
}
