public class GradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85"}; 
        
        for (String g : grades) {
            try {
                int grade = Integer.parseInt(g); 
                System.out.println("Parsed grade: " + grade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + g); 
            }
        }
    }
}