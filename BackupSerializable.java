// File: BackupSerializable.java
import java.io.*;

// Built-in marker interface: Serializable
class UserData implements Serializable {
    private String name;
    private int age;

    public UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserData{name='" + name + "', age=" + age + "}";
    }
}

public class BackupTest {
    public static void main(String[] args) {
        UserData user = new UserData("Lyric", 21);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("backup.dat"))) {
            oos.writeObject(user);
            System.out.println("✅ Data serialized for backup: " + user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
