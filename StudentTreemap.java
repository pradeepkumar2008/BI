import java.util.TreeMap;
public class StudentTreemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> student = new TreeMap<>();

        student.put(2, "Mayank");
        student.put(1, "Mohan");
        student.put(4, "Mayank");
        student.put(3, "Naitik");
        student.put(5, "Himanshu");

        for (int e : student.keySet()) {
            System.out.println(e + "->" + student.get(e));
        }

        student.remove(3);
        System.out.println("Updated Tree Map:");
        for (int e : student.keySet()) {
            System.out.println(e + "->" + student.get(e));
        }

        System.out.println(student.get(5));
    }
}

