import java.util.Random;

public class FootballTeam {
    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int m = arr[0];
        for (int x : arr) if (x < m) m = x;
        return m;
    }

    public static int tallest(int[] arr) {
        int m = arr[0];
        for (int x : arr) if (x > m) m = x;
        return m;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] h = new int[11];
        for (int i = 0; i < 11; i++) h[i] = 150 + r.nextInt(101);
        for (int x : h) System.out.print(x + " ");
        System.out.println();
        System.out.println("Shortest " + shortest(h));
        System.out.println("Tallest " + tallest(h));
        System.out.println("Mean " + mean(h));
    }
}
