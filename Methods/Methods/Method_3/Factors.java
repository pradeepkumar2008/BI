public class Factors {
    public static int[] getFactors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) c++;
        int[] f = new int[c];
        int k = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[k++] = i;
        return f;
    }

    public static int greatest(int[] f) {
        int g = f[0];
        for (int x : f) if (x > g) g = x;
        return g;
    }

    public static int sum(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    public static long product(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    public static double productCubes(int[] f) {
        double p = 1;
        for (int x : f) p *= Math.pow(x, 3);
        return p;
    }

    public static void main(String[] args) {
        int n = 12;
        int[] f = getFactors(n);
        System.out.println("Greatest " + greatest(f));
        System.out.println("Sum " + sum(f));
        System.out.println("Product " + product(f));
        System.out.println("Product Cubes " + productCubes(f));
    }
}
