public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        // Iterate over both strings until one of them is exhausted
        while (i < word1.length() && j < word2.length()) {
            // Append letters from word1 and word2 alternately
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        // If word1 is longer, append the remaining letters to the merged string
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }

        // If word2 is longer, append the remaining letters to the merged string
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately solution = new MergeStringsAlternately();
        String word1 = "tporetu";
        String word2 = "pqr";
        String merged = solution.mergeAlternately(word1, word2);
        System.out.println(merged); // Output: "apbqcr"
    }
}
