import java.io.IOException;

class FileHandler {
    public FileHandler(String fileName) throws IOException { 
        if (fileName.equals("missing.txt")) {
            throw new IOException("File not found: " + fileName);
        }
        System.out.println("File processed: " + fileName);
    }
}

public class ConstructorExceptionDemo {
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("missing.txt");
        } catch (IOException e) {
            System.out.println("Failed to create FileHandler object.");
            System.out.println(e.getMessage());
        }
    }
}