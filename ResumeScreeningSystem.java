import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String title;
    private List<String> requiredSkills;

    public JobRole(String title, List<String> requiredSkills) {
        this.title = title;
        this.requiredSkills = requiredSkills;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    @Override
    public String toString() {
        return title + " - Required Skills: " + requiredSkills;
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer", 
            List.of("Java", "Spring", "SQL", "Git", "Microservices"));
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist", 
            List.of("Python", "Machine Learning", "Statistics", "SQL", "Data Visualization"));
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager", 
            List.of("Product Strategy", "Agile", "User Research", "Market Analysis"));
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T appliedRole;
    private List<String> skills;
    private double matchScore;

    public Resume(String candidateName, T appliedRole, List<String> skills) {
        this.candidateName = candidateName;
        this.appliedRole = appliedRole;
        this.skills = skills;
        this.matchScore = calculateMatchScore();
    }

    private double calculateMatchScore() {
        List<String> requiredSkills = appliedRole.getRequiredSkills();
        int matches = 0;
        for (String skill : skills) {
            if (requiredSkills.contains(skill)) {
                matches++;
            }
        }
        return (double) matches / requiredSkills.size() * 100;
    }

    public double getMatchScore() {
        return matchScore;
    }

    @Override
    public String toString() {
        return "Candidate: " + candidateName + "\n" +
               "Role: " + appliedRole.getClass().getSimpleName() + "\n" +
               "Skills: " + skills + "\n" +
               "Match Score: " + String.format("%.2f%%", matchScore);
    }
}

public class ResumeScreeningSystem {
    public static void screenResumes(List<? extends Resume<?>> resumes, double minimumScore) {
        System.out.println("Screening resumes (Minimum score: " + minimumScore + "%)");
        System.out.println("Qualified candidates:");
        
        resumes.stream()
            .filter(resume -> resume.getMatchScore() >= minimumScore)
            .forEach(resume -> {
                System.out.println("\n" + resume);
            });
    }

    public static void main(String[] args) {
        List<Resume<?>> resumes = new ArrayList<>();

        resumes.add(new Resume<>("John Doe", new SoftwareEngineer(),
            List.of("Java", "Spring", "SQL", "Git", "Docker")));
        
        resumes.add(new Resume<>("Jane Smith", new DataScientist(),
            List.of("Python", "R", "Machine Learning", "Statistics", "SQL")));
        
        resumes.add(new Resume<>("Mike Johnson", new ProductManager(),
            List.of("Product Strategy", "Agile", "User Research", "Communication")));
        
        resumes.add(new Resume<>("Sarah Williams", new SoftwareEngineer(),
            List.of("Python", "JavaScript", "HTML", "CSS")));

        screenResumes(resumes, 70.0);
    }
}