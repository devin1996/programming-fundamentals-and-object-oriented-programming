
public class MergeStrings {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqrs"
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;

        // Alternately append characters from both strings
        while (i < word1.length() && j < word2.length()) {
            mergedString.append(word1.charAt(i++));
            mergedString.append(word2.charAt(j++));
        }

        // Append any remaining characters from word1
        while (i < word1.length()) {
            mergedString.append(word1.charAt(i++));
        }

        // Append any remaining characters from word2
        while (j < word2.length()) {
            mergedString.append(word2.charAt(j++));
        }

        return mergedString.toString();
    }

    public static String mergeAlternately1(String word1, String word2) {
        char[] mergedArray = new char[word1.length() + word2.length()];
        int index = 0;
        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            mergedArray[index++] = word1.charAt(i++);
            mergedArray[index++] = word2.charAt(j++);
        }

        while (i < word1.length()) {
            mergedArray[index++] = word1.charAt(i++);
        }

        while (j < word2.length()) {
            mergedArray[index++] = word2.charAt(j++);
        }

        return new String(mergedArray);
    }

}
