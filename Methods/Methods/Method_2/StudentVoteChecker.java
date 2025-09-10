import java.util.Scanner;
public class StudentVoteChecker {
    public static boolean canStudentVote(int age){
        if(age < 0) return false;
        return age >= 18;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] ages=new int[10];
        for(int i=0;i<10;i++){
            ages[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(canStudentVote(ages[i])) 
                System.out.println("Student "+(i+1)+" age "+ages[i]+" can vote");
            else 
                System.out.println("Student "+(i+1)+" age "+ages[i]+" cannot vote");
        }
    }
}
