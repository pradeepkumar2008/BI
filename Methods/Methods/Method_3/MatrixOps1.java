public class MatrixOps1 {
    public static int[][] createMatrix(int r,int c) {
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)m[i][j]=(int)(Math.random()*10);
        return m;
    }

    public static int[][] add(int[][] a,int[][] b) {
        int[][] r=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)for(int j=0;j<a[0].length;j++)r[i][j]=a[i][j]+b[i][j];
        return r;
    }

    public static int[][] subtract(int[][] a,int[][] b) {
        int[][] r=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)for(int j=0;j<a[0].length;j++)r[i][j]=a[i][j]-b[i][j];
        return r;
    }

    public static int[][] multiply(int[][] a,int[][] b) {
        int[][] r=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)for(int j=0;j<b[0].length;j++)for(int k=0;k<a[0].length;k++)r[i][j]+=a[i][k]*b[k][j];
        return r;
    }

    public static void display(int[][] m) {
        for(int[] row:m){for(int x:row)System.out.print(x+" ");System.out.println();}
    }

    public static void main(String[] args) {
        int[][] a=createMatrix(2,2);
        int[][] b=createMatrix(2,2);
        display(add(a,b));
        display(subtract(a,b));
        display(multiply(a,b));
    }
}
