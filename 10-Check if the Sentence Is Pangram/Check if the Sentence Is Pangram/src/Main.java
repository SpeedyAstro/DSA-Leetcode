public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public boolean checkIfPangram(String sentence) {
        // Create a boolean array to keep track of the presence of each letter
        boolean[] letters = new boolean[26];

        // Iterate through each character in the sentence
        for (char c : sentence.toCharArray()) {
            // Convert the character to lowercase
            c = Character.toLowerCase(c);

            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                // Set the corresponding index in the boolean array to true
                letters[c - 'a'] = true;
            }
        }

        // Check if all letters are present in the boolean array
        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}