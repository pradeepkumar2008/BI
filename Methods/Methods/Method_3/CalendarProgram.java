import java.util.Scanner;

public class CalendarProgram {
    public static String getMonthName(int m) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[m - 1];
    }

    public static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static int getDays(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeap(y)) return 29;
        return days[m - 1];
    }

    public static int getFirstDay(int m, int y) {
        int d = 1, c = y / 100, k = y % 100;
        if (m < 3) { m += 12; y--; k = y % 100; c = y / 100; }
        int f = d + (13 * (m + 1)) / 5 + k + k / 4 + c / 4 + 5 * c;
        return f % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        int days = getDays(m, y);
        int start = getFirstDay(m, y);
        System.out.println(getMonthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < start; i++) System.out.print("    ");
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0) System.out.println();
        }
    }
}
