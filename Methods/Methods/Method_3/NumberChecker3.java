import java.util.Arrays;

public class NumberChecker3 {
    public static int[] getDigits(int n) {
        int c = 0, t = n;
        while (t > 0) {
            c++;
            t /= 10;
        }
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    public static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) r[i] = d[d.length - 1 - i];
        return r;
    }

    public static boolean isEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] d) {
        return isEqual(d, reverse(d));
    }

    public static boolean isDuck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 1221;
        int[] d = getDigits(n);
        System.out.println("Palindrome " + isPalindrome(d));
        System.out.println("Duck " + isDuck(d));
    }
}
