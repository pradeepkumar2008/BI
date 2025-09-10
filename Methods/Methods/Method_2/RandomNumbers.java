import java.util.Random;
public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size){
        Random rand=new Random();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=1000+rand.nextInt(9000);
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] arr){
        int min=arr[0],max=arr[0];
        int sum=0;
        for(int x:arr){
            if(x<min) min=x;
            if(x>max) max=x;
            sum+=x;
        }
        double avg=(double)sum/arr.length;
        return new double[]{avg,min,max};
    }
    public static void main(String[] args){
        int[] numbers=generate4DigitRandomArray(5);
        System.out.print("Numbers: ");
        for(int x:numbers) System.out.print(x+" ");
        System.out.println();
        double[] result=findAverageMinMax(numbers);
        System.out.println("Average: "+result[0]);
        System.out.println("Min: "+result[1]);
        System.out.println("Max: "+result[2]);
    }
}
