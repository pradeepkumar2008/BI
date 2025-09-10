public class NumberChecker4 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1, t = n;
        while (t > 0) {
            int d = t % 10;
            sum += d;
            prod *= d;
            t /= 10;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        String s = String.valueOf(n * n);
        return s.endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println("Prime " + isPrime(n));
        System.out.println("Neon " + isNeon(n));
        System.out.println("Spy " + isSpy(n));
        System.out.println("Automorphic " + isAutomorphic(n));
        System.out.println("Buzz " + isBuzz(n));
    }
}
