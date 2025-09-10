import java.util.Scanner;

public class ShortestLongestWord {
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] customSplit(String text) {
        int n = customLength(text);
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }
        String[] words = new String[spaceCount + 1];
        int start = 0, wordIndex = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start, n);
        return words;
    }

    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestLongest(String[][] arr) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (Integer.parseInt(arr[i][1]) < Integer.parseInt(arr[minIndex][1]))
                minIndex = i;
            if (Integer.parseInt(arr[i][1]) > Integer.parseInt(arr[maxIndex][1]))
                maxIndex = i;
        }
        return new String[]{arr[minIndex][0], arr[maxIndex][0]};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] arr = wordWithLengths(words);
        String[] result = findShortestLongest(arr);

        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}
