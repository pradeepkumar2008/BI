public class NumberChecker1 {
    public static int countDigits(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static int[] getDigits(int n) {
        int c = countDigits(n);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    public static boolean isDuck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] d) {
        int p = d.length;
        int s = 0;
        for (int x : d) s += Math.pow(x, p);
        int n = 0;
        for (int x : d) n = n * 10 + x;
        return n == s;
    }

    public static int[] largestTwo(int[] d) {
        int f = Integer.MIN_VALUE, s = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > f) {
                s = f;
                f = x;
            } else if (x > s && x != f) {
                s = x;
            }
        }
        return new int[]{f, s};
    }

    public static int[] smallestTwo(int[] d) {
        int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < f) {
                s = f;
                f = x;
            } else if (x < s && x != f) {
                s = x;
            }
        }
        return new int[]{f, s};
    }

    public static void main(String[] args) {
        int n = 153;
        int[] d = getDigits(n);
        System.out.println("Duck " + isDuck(d));
        System.out.println("Armstrong " + isArmstrong(d));
        int[] l = largestTwo(d);
        System.out.println("Largest " + l[0] + " Second " + l[1]);
        int[] s = smallestTwo(d);
        System.out.println("Smallest " + s[0] + " Second " + s[1]);
    }
}
