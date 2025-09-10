public class EmployeeBonus {
    public static int[][] generateData(int n) {
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 10000 + (int)(Math.random() * 90000);
            arr[i][1] = 1 + (int)(Math.random() * 10);
        }
        return arr;
    }

    public static double[][] calculateBonus(int[][] arr) {
        double[][] res = new double[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            double bonus = arr[i][1] > 5 ? arr[i][0] * 0.05 : arr[i][0] * 0.02;
            res[i][0] = arr[i][0] + bonus;
            res[i][1] = bonus;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] data = generateData(10);
        double[][] res = calculateBonus(data);
        double oldSum=0,newSum=0,totalBonus=0;
        for (int i = 0; i < data.length; i++) {
            System.out.println("Salary " + data[i][0] + " Years " + data[i][1] + " New " + res[i][0] + " Bonus " + res[i][1]);
            oldSum += data[i][0];
            newSum += res[i][0];
            totalBonus += res[i][1];
        }
        System.out.println("Old Total " + oldSum);
        System.out.println("New Total " + newSum);
        System.out.println("Total Bonus " + totalBonus);
    }
}
