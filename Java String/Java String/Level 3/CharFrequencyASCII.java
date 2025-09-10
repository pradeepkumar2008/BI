import java.util.Scanner;

public class CharFrequencyASCII {
    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        String[][] result = new String[text.length()][2];
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] != 0) {
                result[k][0] = String.valueOf(c);
                result[k][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                k++;
            }
        }
        String[][] finalRes = new String[k][2];
        for (int i = 0; i < k; i++) finalRes[i] = result[i];
        return finalRes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] res = frequency(text);
        for (String[] row : res) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }
}
