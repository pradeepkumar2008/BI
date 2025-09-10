public class StudentScores {
    public static int[][] generateScores(int n) {
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                arr[i][j] = 10 + (int)(Math.random() * 90);
        return arr;
    }

    public static double[][] calculate(int[][] arr) {
        double[][] res = new double[arr.length][3];
        for (int i = 0; i < arr.length; i++) {
            int total = arr[i][0]+arr[i][1]+arr[i][2];
            double avg = total/3.0;
            double perc = (total/300.0)*100;
            res[i][0]=total;
            res[i][1]=Math.round(avg*100.0)/100.0;
            res[i][2]=Math.round(perc*100.0)/100.0;
        }
        return res;
    }

    public static void main(String[] args) {
        int n=5;
        int[][] scores = generateScores(n);
        double[][] res = calculate(scores);
        for (int i=0;i<n;i++) {
            System.out.println("P "+scores[i][0]+" C "+scores[i][1]+" M "+scores[i][2]+" Total "+res[i][0]+" Avg "+res[i][1]+" % "+res[i][2]);
        }
    }
}
