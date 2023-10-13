Note: Pangram Checker
Method: checkIfPangram
Description:
This method checks if a given sentence is a pangram, which means it contains every letter of the alphabet at least once.
Parameters:
- `sentence` (String): The sentence to be checked.

Return Type:
- `boolean`: `true` if the sentence is a pangram, `false` otherwise.
Steps
1. Create a boolean array `letters` of size 26 to keep track of the presence of each letter.
2. Iterate through each character `c` in the sentence.
3. Convert the character to lowercase.
4. Check if the character is a lowercase letter.
5. If it is, set the corresponding index in the `letters` array to `true`.
6. Check if all letters are present in the `letters` array.
7. If any letter is missing, return `false`.
8. If all letters are present, return `true`.