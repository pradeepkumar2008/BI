// File: SensitiveDataMarker.java

// Custom marker interface
interface SensitiveData { }

// Class that holds sensitive information
class EmployeeDetails implements SensitiveData {
    String name;
    String ssn;

    EmployeeDetails(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}

public class SecurityCheck {
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails("Lyric", "AB12345XYZ");

        // Check if the object is marked as sensitive
        if (emp instanceof SensitiveData) {
            System.out.println("🔐 Encrypting data before saving...");
        } else {
            System.out.println("Storing data normally.");
        }
    }
}
