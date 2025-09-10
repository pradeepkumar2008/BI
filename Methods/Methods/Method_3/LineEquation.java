public class LineEquation {
    public static double distance(int x1,int y1,int x2,int y2) {
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public static double[] equation(int x1,int y1,int x2,int y2) {
        double m = (double)(y2-y1)/(x2-x1);
        double b = y1 - m*x1;
        return new double[]{m,b};
    }

    public static void main(String[] args) {
        int x1=2,y1=3,x2=5,y2=7;
        System.out.println("Distance " + distance(x1,y1,x2,y2));
        double[] eq = equation(x1,y1,x2,y2);
        System.out.println("Slope " + eq[0] + " Intercept " + eq[1]);
    }
}
