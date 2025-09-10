import java.util.Scanner;

public class CharFrequencyUnique {
    public static char[] findUnique(String text) {
        char[] temp = new char[text.length()];
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) { unique = false; break; }
            }
            if (unique) temp[k++] = c;
        }
        char[] result = new char[k];
        for (int i = 0; i < k; i++) result[i] = temp[i];
        return result;
    }

    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        char[] unique = findUnique(text);
        String[][] res = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(freq[unique[i]]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] res = frequency(text);
        for (String[] row : res) System.out.println(row[0] + " : " + row[1]);
    }
}
