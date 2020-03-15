package B18_Threading.PrimeNumber;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println("Optimized: " + i);
            }
        }
    }

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
