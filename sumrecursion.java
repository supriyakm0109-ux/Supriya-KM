public class sumrecursion {
    static boolean isPrime(int n, int i) {
        if (i * i > n)
            return true;

        if (n % i == 0)
            return false;

        return isPrime(n, i + 1);
    }

    static int sumPrimes(int n) {
        if (n > 100)
            return 0;

        if (isPrime(n, 2))
            return n + sumPrimes(n + 1);

        return sumPrimes(n + 1);
    }

    public static void main(String[] args) {
        int sum = sumPrimes(2);
        System.out.println("Sum = " + sum);
    }
}
    
