import java.util.ArrayList;

public class MarksReport {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc"};
        
        ArrayList<Integer> validMarks = new ArrayList<>();
        double sum = 0;
        
        for (Object m : marks) {
            Integer validMark = null;
            if (m instanceof Integer) {
                validMark = (Integer) m;
            } else if (m instanceof String) {
                try {
                    if (!((String) m).equalsIgnoreCase("null")) {
                        validMark = Integer.parseInt((String) m);
                    }
                } catch (NumberFormatException e) {
                    
                }
            }
            
            if (validMark != null) {
                validMarks.add(validMark);
                sum += validMark;
            }
        }
        
        double average = sum / validMarks.size();
        System.out.println("Valid Marks: " + validMarks);
        System.out.println("Average Mark: " + average);
    }
}