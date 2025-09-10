import java.util.Scanner;

public class CharFrequencyNested {
    public static String[] frequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        String[] res = new String[chars.length];
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                res[k++] = chars[i] + " : " + freq[i];
            }
        }
        String[] finalRes = new String[k];
        for (int i = 0; i < k; i++) finalRes[i] = res[i];
        return finalRes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] res = frequency(text);
        for (String s : res) System.out.println(s);
    }
}
