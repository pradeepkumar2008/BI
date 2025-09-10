public class NumberChecker2 {
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

    public static int sum(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    public static int sumSquares(int[] d) {
        int s = 0;
        for (int x : d) s += Math.pow(x, 2);
        return s;
    }

    public static boolean isHarshad(int n, int[] d) {
        return n % sum(d) == 0;
    }

    public static int[][] frequency(int[] d) {
        int[][] f = new int[10][2];
        for (int i = 0; i < 10; i++) f[i][0] = i;
        for (int x : d) f[x][1]++;
        return f;
    }

    public static void main(String[] args) {
        int n = 1729;
        int[] d = getDigits(n);
        System.out.println("Sum " + sum(d));
        System.out.println("Sum of Squares " + sumSquares(d));
        System.out.println("Harshad " + isHarshad(n, d));
        int[][] f = frequency(d);
        for (int i = 0; i < f.length; i++) {
            if (f[i][1] > 0) System.out.println(f[i][0] + " -> " + f[i][1]);
        }
    }
}
