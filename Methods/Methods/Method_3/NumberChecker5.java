public class NumberChecker5 {
    public static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum < n;
    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int n) {
        int t = n, sum = 0;
        while (t > 0) {
            sum += fact(t % 10);
            t /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 145;
        System.out.println("Perfect " + isPerfect(n));
        System.out.println("Abundant " + isAbundant(n));
        System.out.println("Deficient " + isDeficient(n));
        System.out.println("Strong " + isStrong(n));
    }
}
