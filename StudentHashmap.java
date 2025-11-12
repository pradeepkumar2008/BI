import java.util.HashMap;

public class StudentHashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        student.put(2, "Mayank");
        student.put(1, "Mohan");
        student.put(4, "Mayank");
        student.put(3, "Naitik");
        student.put(5, "Himanshu");
        for(int e : student.keySet()){
            System.out.println(e + "->" + student.get(e));
        }
        student.remove(3);
        for(int e : student.keySet()){
            System.out.println(e + "->" + student.get(e));
        }
        System.out.println(student.get(5));

    }
}